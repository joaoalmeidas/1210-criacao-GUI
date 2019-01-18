import java.awt.BorderLayout;
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
		setLayout(new BorderLayout());
		
		norte = new JPanel();
		sul = new JPanel();
		
		add(norte, BorderLayout.NORTH);
		add(sul, BorderLayout.CENTER);
		
		norte.setLayout(new BorderLayout());
		sul.setLayout(new GridLayout(2, 2));
		
		cores = new JComboBox<String>(nomeCores);
		cores.setMaximumRowCount(2);
		
		norte.add(cores, BorderLayout.NORTH);
		
		checkBackground = new JCheckBox("Background");
		checkForeground = new JCheckBox("Foreground");
		
		sul.add(checkBackground);
		sul.add(checkForeground);
		
		botaoOk = new JButton("Ok");
		botaoCancelar = new JButton("Cancelar");
		
		sul.add(botaoOk);
		sul.add(botaoCancelar);
	}
	
}
