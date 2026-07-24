CREATE TABLE Responsavel (
    ID_responsavel SERIAL PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    CPF VARCHAR(14) UNIQUE NOT NULL,
    Telefone VARCHAR(20)
);

CREATE TABLE Aluno (
    ID_aluno SERIAL PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Data_nascimento DATE NOT NULL,
    ID_responsavel INT NOT NULL,
    FOREIGN KEY (ID_responsavel) REFERENCES Responsavel(ID_responsavel) ON DELETE CASCADE
);

CREATE TABLE Status (
    ID_Status SERIAL PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL
);

CREATE TABLE Mensalidade (
    ID_mensalidade SERIAL PRIMARY KEY,
    Valor DECIMAL(10, 2) NOT NULL,
    Data_pagamento DATE,
    Data_vencimento DATE NOT NULL,
    ID_aluno INT NOT NULL,
    ID_Status INT NOT NULL,
    FOREIGN KEY (ID_aluno) REFERENCES Aluno(ID_aluno) ON DELETE CASCADE,
    FOREIGN KEY (ID_Status) REFERENCES Status(ID_Status)
);

CREATE TABLE Matricula (
    ID_matricula SERIAL PRIMARY KEY,
    ID_aluno INT NOT NULL,
    FOREIGN KEY (ID_aluno) REFERENCES Aluno(ID_aluno) ON DELETE CASCADE
);

CREATE TABLE Professor (
    ID_professor SERIAL PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    CREF VARCHAR(20) UNIQUE NOT NULL,
    Telefone VARCHAR(20)
);

CREATE TABLE Campo (
    ID_campo SERIAL PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Endereco VARCHAR(200),
    Tipo VARCHAR(50)
);

CREATE TABLE Turma (
    ID_turma SERIAL PRIMARY KEY,
    Horario_Inicio TIME NOT NULL,
    Horario_Fim TIME NOT NULL,
    ID_professor INT NOT NULL,
    ID_campo INT NOT NULL,
    FOREIGN KEY (ID_professor) REFERENCES Professor(ID_professor),
    FOREIGN KEY (ID_campo) REFERENCES Campo(ID_campo)
);

CREATE TABLE Turma_Matricula (
    ID_matricula INT NOT NULL,
    ID_turma INT NOT NULL,
    PRIMARY KEY (ID_matricula, ID_turma),
    FOREIGN KEY (ID_matricula) REFERENCES Matricula(ID_matricula) ON DELETE CASCADE,
    FOREIGN KEY (ID_turma) REFERENCES Turma(ID_turma) ON DELETE CASCADE
);
