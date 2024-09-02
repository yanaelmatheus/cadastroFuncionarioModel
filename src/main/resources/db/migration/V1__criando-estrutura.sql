CREATE TABLE DEPARTAMENTOS(
idDepartamento serial PRIMARY KEY,
nome varchar(200)
);

CREATE TABLE FUNCIONARIOS(
idFuncionario serial PRIMARY KEY,
nome varchar(200),
dtNasc date,
sexo varchar(50),
idDepartamento INT,
FOREIGN KEY ( idDepartamento )
	REFERENCES DEPARTAMENTOS ( idDepartamento )
);