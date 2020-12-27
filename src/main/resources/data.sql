DROP TABLE IF EXISTS usuario;

create table usuario (
        id integer not null,
		nome varchar(255),
        email varchar(255),
        digito_unico bigint,
		resultado bigint,
        primary key (id)
    );
	


