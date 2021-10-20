package aula05_P1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class aula_6
{
    
    
    public void criptografa(String texto)
    {
        String textoCifrado = texto;
      
        
        JFileChooser arquivo = new JFileChooser();
        int retorno = arquivo.showSaveDialog(null);  
        if(retorno == JFileChooser.APPROVE_OPTION)  
        {
            String caminho = arquivo.getSelectedFile().getAbsolutePath();  
            String extensao = caminho + ".criptografado";
            try  
            {
                try (FileWriter fw = new FileWriter(extensao))
                {
                    fw.write(textoCifrado);
                    System.out.println(textoCifrado);
                }
            }  
            catch(FileNotFoundException e)  
            {
                JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo!\n" + e, "Erro!", 0);    
            }  
            catch(IOException e)  
            {
                JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo\n" + e, "Erro", 0);    
            }
        }
    }
    
    public String decriptografa(String texto)
    {
      
        texto = null;
        return texto;
    }
}		
