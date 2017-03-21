package br.univel1;

import java.awt.Color;

import javax.swing.JFrame;

import br.univel1.MeuPainel;

public class Principal1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Ex02P1");
		jf.setSize(800, 800);
		jf.setLocationRelativeTo(null); // centralizar no desktop
		
		MeuPainel meuPainel = new MeuPainel();
		
		meuPainel.setBackground(Color.WHITE);
		
		jf.setContentPane(meuPainel);	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o programa e não só a janela

		jf.setVisible(true);		
	}	

}
