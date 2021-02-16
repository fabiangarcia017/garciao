-- -----------------------------------------------------
-- Usare MySQL
-- -----------------------------------------------------
CREATE DATABASE TiendasElectronicos;

CREATE TABLE Tienda(
IdTienda VARCHAR(3) NOT NULL,
Nombre VARCHAR(45) NOT NULL,
Direccion VARCHAR(45) NOT NULL,
PRIMARY KEY(IdTienda)
);
CREATE TABLE Departamento(
IdDep VARCHAR(3) NOT NULL,
NombreDep VARCHAR(45) NOT NULL,
PRIMARY KEY(IdDep),
);
CREATE TABLE Articulo(
IdArt VARCHAR(3) NOT NULL,
NombreArt VARCHAR(45) NOT NULL,
Tipo VARCHAR(45) NULL,
Precio DOUBLE NULL,
IdDep VARCHAR(3) NULL,
IdTienda VARCHAR(3) NULL,
PRIMARY KEY(IdArt),
CONSTRAINT fk_Articulo_Tienda FOREIGN KEY(IdTienda) REFERENCES Tienda(IdTienda),
CONSTRAINT fk_Articulo_Departamento FOREIGN KEY(IdDep) REFERENCES Departamento(IdDep)
);
CREATE TABLE Empleado(
IdEmp VARCHAR(3) NOT NULL,
NombreEmp VARCHAR(45) NOT NULL,
TipoEmp VARCHAR(45) NULL,
Edad INT NULL,
IdDep VARCHAR(3) NULL,
IdTienda VARCHAR(3) NULL,
PRIMARY KEY(IdEmp),
CONSTRAINT fk_Empleado_Tienda FOREIGN KEY(IdTienda) REFERENCES Tienda(IdTienda),
CONSTRAINT fk_Empleado_Departamento FOREIGN KEY(IdDep) REFERENCES Departamento(IdDep)
);

insert into Tienda values('AB1','Apple','Ayutla 229');
insert into Tienda values('AB2','microsoft','Ibarra 316');
insert into Tienda values('AB3','steren','Juarez 456');

insert into Departamento values('CD1','Moviles');
insert into Departamento values('CD2','Perifericos');
insert into Departamento values('CD3','Computo');
insert into Departamento values('CD4','Procesadores');
insert into Departamento values('CD5','Tarjetas de Video');
insert into Departamento values('CD6','Cargadores');

insert into Articulo values('EF1','Samsung s9','Movil','9000','CD1','AB2');
insert into Articulo values('EF2','LG M1546','Movil','6000','CD1','AB2');
insert into Articulo values('EF3','Audifonos wifi','Periferico','600','CD2','AB1');
insert into Articulo values('EF4','Teclado Rgb','Periferico','400','CD2','AB1');
insert into Articulo values('EF5','DEll 451','Computo','15000','CD3','AB3');
insert into Articulo values('EF6','Intel i5','Procesador','6500','CD4','AB2');
insert into Articulo values('EF7','Nvidia 1080','Tarjeta de video','13000','CD5','AB3');
insert into Articulo values('EF8','Cargador Iphone 11','Cargador','500','CD6','AB1');

insert into Empleado values('GH1','Ernesto','Confianza','23','CD3','AB1');
insert into Empleado values('GH2','Pedro','Sindicalizado','22','CD4','AB2');
insert into Empleado values('GH3','Clemente','Confianza','30','CD1','AB3');
insert into Empleado values('GH4','Pedro','Confianza','21','CD2','AB1');
insert into Empleado values('GH5','Alan','Sindicalizado','24','CD5','AB2');
insert into Empleado values('GH6','Rolando','Confianza','20','CD6','AB1');
insert into Empleado values('GH7','Silvia','Sindicalizada','21','CD3','AB3');
insert into Empleado values('GH8','Maria','Confianza','19','CD1','AB1');
insert into Empleado values('GH9','Jose','Sindicalizado','20','CD4','AB2');