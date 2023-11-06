use Pruebas_tokio

create table RegistroVisitantes
(idVisi int primary key,
nombreVisi varchar(50),
apellidosVisi varchar(50),
tipoDocVisi varchar(50),
apartamentoVisi varchar(50),
edadVisi varchar(50),
vehiculo varchar(50),
fechaEntrada date,
horaEntrada time)

create table salidaVisitante
(idVisi int primary key,
nombreVisi varchar(50),
apellidosVisi varchar(50),
tipoDocVisi varchar(50),
apartamentoVisi varchar(50),
edadVisi varchar(50),
vehiculo varchar(50),
fechaSalida date,
HoraSalida time)

go
create TRIGGER salidas
ON RegistroVisitantes
FOR DELETE
AS 
BEGIN
    INSERT INTO salidaVisitante (idVisi, nombreVisi, apellidosVisi, tipoDocVisi, apartamentoVisi,
    edadVisi, vehiculo, fechaSalida,HoraSalida)
    SELECT deleted.idVisi, deleted.nombreVisi, deleted.apellidosVisi,
       deleted.tipoDocVisi, deleted.apartamentoVisi, deleted.edadVisi,
       deleted.vehiculo, getdate(),CONVERT(time, GETDATE())
    FROM deleted;
END

go
create trigger captura
on RegistroVisitantes
for insert
as
begin
    declare @Fecha date, @hora time, @id int

    select top 1 @id = idVisi from RegistroVisitantes order by idVisi desc

    set @Fecha = getdate()
    set @hora = CONVERT(time, GETDATE())

    update RegistroVisitantes
       set fechaEntrada = @Fecha, horaEntrada = @hora
       where idVisi = @id
end

insert into RegistroVisitantes (idVisi,nombreVisi,apellidosVisi,tipoDocVisi,apartamentoVisi,edadVisi,vehiculo) 
values (1,'Juan','Bedoya','CC','0112','18','Carro')
delete RegistroVisitantes

select * from RegistroVisitantes
select * from salidaVisitante

SELECT COUNT(vehiculo) FROM RegistroVisitantes where vehiculo = 'Carro'