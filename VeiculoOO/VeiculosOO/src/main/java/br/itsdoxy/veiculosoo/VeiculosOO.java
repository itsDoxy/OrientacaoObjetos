/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.itsdoxy.veiculosoo;

import javax.swing.JOptionPane;

/**
 *
 * @author tiger
 */
public class VeiculosOO {

    public static void main(String[] args) {
        
        //Molde, classe principal (mãe, pai, superclasse)
    class Veiculo{
        public int veiAno;
        public String veiNome;
    }
        Veiculo objV1 = new Veiculo();
	objV1.veiAno = 1965;        
	objV1.veiNome = "Brasília";
        JOptionPane.showMessageDialog(null, "\n*** Dados da Classe Veículo ***" +
        "\nAno do Veículo: " + objV1.veiAno + "\nNome do Veículo: " + objV1.veiNome.toUpperCase());

    }
}
