package Task_1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Downloader extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnSave;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Downloader frame = new Downloader();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Downloader()
	{
		setTitle("ImageDownloader");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 450, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[61px][4px][256px][12px][75px]", "[28px][29px]"));

		JLabel lblPasteUrl = new JLabel("Paste URL");
		contentPane.add(lblPasteUrl, "cell 0 0,alignx left,aligny center");

		textField = new JTextField();
		contentPane.add(textField, "cell 1 0 4 1,growx,aligny top");
		textField.setColumns(10);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new File("/home/me/Documents"));
				int retrival = chooser.showSaveDialog(null);

				if(retrival == JFileChooser.APPROVE_OPTION)
				{
					try
					{
						URL url = new URL(textField.getText());
						InputStream in = new BufferedInputStream(url.openStream());
						OutputStream out = new BufferedOutputStream(new FileOutputStream(chooser
								.getSelectedFile().getAbsolutePath()
								+ url.getPath().substring(url.getPath().lastIndexOf("."))));

						for (int i; (i = in.read()) != -1;)
						{
							out.write(i);
							progressBar.setString("Done!");
							progressBar.setStringPainted(true);
						}
						in.close();
						out.close();
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
				}
			}
		});

		progressBar = new JProgressBar();
		progressBar.setEnabled(false);
		contentPane.add(progressBar, "cell 2 1,growx,aligny center");
		contentPane.add(btnSave, "cell 4 1,alignx left,aligny top");

	}
}
