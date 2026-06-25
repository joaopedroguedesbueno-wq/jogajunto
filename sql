CREATE TABLE equipe (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cidade VARCHAR(100),
    escudo VARCHAR(255)
);
CREATE TABLE partida (
    id SERIAL PRIMARY KEY,
    rodada INTEGER NOT NULL,
    data DATE NOT NULL,
    horario TIME NOT NULL,
    local VARCHAR(150) NOT NULL,

    equipe1_id INTEGER NOT NULL,
    equipe2_id INTEGER NOT NULL,
    competicao_id INTEGER NOT NULL,

    gols_casa INTEGER DEFAULT 0,
    gols_visitante INTEGER DEFAULT 0,

    CONSTRAINT fk_partida_equipe1
        FOREIGN KEY (equipe1_id)
        REFERENCES equipe(id),

    CONSTRAINT fk_partida_equipe2
        FOREIGN KEY (equipe2_id)
        REFERENCES equipe(id),

    CONSTRAINT fk_partida_competicao
        FOREIGN KEY (competicao_id)
        REFERENCES competicao(id),

    CONSTRAINT chk_equipes_diferentes
        CHECK (equipe1_id <> equipe2_id),

    CONSTRAINT chk_gols_casa
        CHECK (gols_casa >= 0),

    CONSTRAINT chk_gols_visitante
        CHECK (gols_visitante >= 0)
);

CREATE TABLE competicao (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100)
);
