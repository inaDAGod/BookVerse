-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-06-05 17:14:58.875

-- tables
-- Table: autores
CREATE TABLE autores (
    nombre varchar(20)  NOT NULL,
    photourl varchar(40)  NOT NULL,
    CONSTRAINT autores_pk PRIMARY KEY (nombre)
);

-- Table: estados
CREATE TABLE estados (
    idestado int  NOT NULL,
    detalles varchar(20)  NOT NULL,
    CONSTRAINT estados_pk PRIMARY KEY (idestado)
);

-- Table: estanteria_publicacion
CREATE TABLE estanteria_publicacion (
    idestanteria int  NOT NULL,
    ISBM varchar(30)  NOT NULL,
    CONSTRAINT estanteria_publicacion_pk PRIMARY KEY (idestanteria,ISBM)
);

-- Table: estanterias
CREATE TABLE estanterias (
    idestanteria int  NOT NULL,
    nombre varchar(20)  NOT NULL,
    descripcion varchar(50)  NOT NULL,
    CONSTRAINT estanterias_pk PRIMARY KEY (idestanteria)
);

-- Table: generos_literarios
CREATE TABLE generos_literarios (
    idgenero int  NOT NULL,
    genero int  NOT NULL,
    CONSTRAINT generos_literarios_pk PRIMARY KEY (idgenero)
);

-- Table: lector_estanteria
CREATE TABLE lector_estanteria (
    idlector varchar(30)  NOT NULL,
    idestanteria int  NOT NULL,
    propiedad int  NOT NULL,
    CONSTRAINT lector_estanteria_pk PRIMARY KEY (idestanteria,idlector)
);

-- Table: lectores
CREATE TABLE lectores (
    idlector varchar(30)  NOT NULL,
    nombre varchar(20)  NOT NULL,
    presupuesto int  NOT NULL,
    photoUrl varchar(40)  NOT NULL,
    contrasenia varchar(10)  NOT NULL,
    CONSTRAINT lectores_pk PRIMARY KEY (idlector)
);

-- Table: publicaciones
CREATE TABLE publicaciones (
    ISBM varchar(30)  NOT NULL,
    titulo varchar(30)  NOT NULL,
    precio varchar(20)  NOT NULL,
    portadaurl varchar(40)  NOT NULL,
    calificacionPromedio varchar(20)  NOT NULL,
    descripcion varchar(50)  NOT NULL,
    escritor varchar(20)  NOT NULL,
    ilustrador varchar(20)  NOT NULL,
    editorial varchar(20)  NOT NULL,
    paginas int  NOT NULL,
    idestado int  NOT NULL,
    idgenero int  NOT NULL,
    idtipo_publicacion int  NOT NULL,
    calificacion varchar(20)  NOT NULL,
    resenia varchar(50)  NOT NULL,
    frase varchar(50)  NOT NULL,
    preferencia varchar(50)  NOT NULL,
    CONSTRAINT publicaciones_pk PRIMARY KEY (ISBM)
);

-- Table: tipos_publicacion
CREATE TABLE tipos_publicacion (
    idtipo_publicacion int  NOT NULL,
    detalles int  NOT NULL,
    CONSTRAINT tipos_publicacion_pk PRIMARY KEY (idtipo_publicacion)
);

-- foreign keys
-- Reference: estanteria_publicacion_estanterias (table: estanteria_publicacion)
ALTER TABLE estanteria_publicacion ADD CONSTRAINT estanteria_publicacion_estanterias
    FOREIGN KEY (idestanteria)
    REFERENCES estanterias (idestanteria)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: estanteria_publicacion_publicaciones (table: estanteria_publicacion)
ALTER TABLE estanteria_publicacion ADD CONSTRAINT estanteria_publicacion_publicaciones
    FOREIGN KEY (ISBM)
    REFERENCES publicaciones (ISBM)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: lector_estanteria_estanterias (table: lector_estanteria)
ALTER TABLE lector_estanteria ADD CONSTRAINT lector_estanteria_estanterias
    FOREIGN KEY (idestanteria)
    REFERENCES estanterias (idestanteria)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: lector_estanteria_lectores (table: lector_estanteria)
ALTER TABLE lector_estanteria ADD CONSTRAINT lector_estanteria_lectores
    FOREIGN KEY (idlector)
    REFERENCES lectores (idlector)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_autores (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_autores
    FOREIGN KEY (escritor)
    REFERENCES autores (nombre)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_autores2 (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_autores2
    FOREIGN KEY (ilustrador)
    REFERENCES autores (nombre)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_autores3 (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_autores3
    FOREIGN KEY (editorial)
    REFERENCES autores (nombre)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_estados (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_estados
    FOREIGN KEY (idestado)
    REFERENCES estados (idestado)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_generosliterarios (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_generosliterarios
    FOREIGN KEY (idgenero)
    REFERENCES generos_literarios (idgenero)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: publicaciones_tipopublicacion (table: publicaciones)
ALTER TABLE publicaciones ADD CONSTRAINT publicaciones_tipopublicacion
    FOREIGN KEY (idtipo_publicacion)
    REFERENCES tipos_publicacion (idtipo_publicacion)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- sequences
-- Sequence: autores_seq
CREATE SEQUENCE autores_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: estados_seq
CREATE SEQUENCE estados_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: estanteria_publicacion_seq
CREATE SEQUENCE estanteria_publicacion_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: estanterias_seq
CREATE SEQUENCE estanterias_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: generos_literarios_seq
CREATE SEQUENCE generos_literarios_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: lector_estanteria_seq
CREATE SEQUENCE lector_estanteria_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: lectores_seq
CREATE SEQUENCE lectores_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: publicaciones_seq
CREATE SEQUENCE publicaciones_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: tipos_estanterias_seq
CREATE SEQUENCE tipos_estanterias_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: tipos_publicacion_seq
CREATE SEQUENCE tipos_publicacion_seq
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- End of file.

