package edu.br.unoesc.ulife.login.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Pessoa")
public class Pessoa {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String nome;

        @Column
        private String sobrenome;

        @Column
        private int cpf;

        @Column
        private int rg;

        @Column
        private int endereco;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getSobrenome() {
                return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;
        }

        public int getCpf() {
                return cpf;
        }

        public void setCpf(int cpf) {
                this.cpf = cpf;
        }

        public int getRg() {
                return rg;
        }

        public void setRg(int rg) {
                this.rg = rg;
        }

        public int getEndereco() {
                return endereco;
        }

        public void setEndereco(int endereco) {
                this.endereco = endereco;
        }
}
