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
	private final JPanel sul;
	
	private final String[] nomeCores = {"Vermelho", "Azul", "Verde"};
	
	public ColorSelectFrame(){
		
		super("ColorSelect");
		setLayout(new FlowLayout());
		
		
		
	}
	
}
