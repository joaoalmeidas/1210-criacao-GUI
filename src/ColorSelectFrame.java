import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorSelectFrame extends JFrame {
	
	private final JComboBox<String> cores;
	
	
	private final JCheckBox checkBackground;
	private final JCheckBox checkForeground;
	
	
	private final JButton botaoOk;
	private final JButton botaoCancelar;
	
	
	private final JPanel norte;
	private final JPanel centro;
	private final JPanel sul;
	
	
	private final String[] nomeCores = {"Vermelho", "Azul", "Verde"};
	
	
	public ColorSelectFrame(){
		
		super("ColorSelect");
		setLayout(new BorderLayout());
		
		norte = new JPanel();
		sul = new JPanel();
		centro = new JPanel();
		
		norte.setLayout(new BorderLayout());
		sul.setLayout(new FlowLayout());
		centro.setLayout(new FlowLayout());
		
		cores = new JComboBox<String>(nomeCores);
		
		norte.add(cores, BorderLayout.NORTH);
		
		add(norte, BorderLayout.NORTH);
		
		checkBackground = new JCheckBox("Background");
		checkForeground = new JCheckBox("Foreground");
		
		centro.add(checkBackground);
		centro.add(checkForeground);
		
		add(centro, BorderLayout.CENTER);
		
		botaoOk = new JButton("Ok");
		botaoCancelar = new JButton("Cancelar");
		
		sul.add(botaoOk);
		sul.add(botaoCancelar);
		
		add(sul, BorderLayout.SOUTH);
	}
	
}
