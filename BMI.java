
/**
 * Write a description of class BMI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BMI extends JFrame
{
    JButton computeBMIButton = new JButton();
    JButton clearButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel nameLabel = new JLabel();
    JLabel ageLabel = new JLabel();
    JLabel heightLabel = new JLabel();
    JLabel weightLabel = new JLabel();
    JLabel BMI_Label = new JLabel();
    JLabel feetLabel = new JLabel();
    JLabel inchesLabel = new JLabel();
    JLabel poundsLabel = new JLabel();
    
    JTextField nameTF = new JTextField();
    JTextField ageTF = new JTextField();
    JTextField heightTF = new JTextField();
    JTextField weightTF = new JTextField();
    JTextField BMI_TF = new JTextField();
    
    public BMI(){
        setTitle("BMI Calculator");
        setSize(300,200);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gC = new GridBagConstraints();
        
        nameLabel.setText("Name: ");
        gC.gridx = 0;
        gC.gridy = 0;
        getContentPane().add(nameLabel,gC);
        
        ageLabel.setText("Age: ");
        gC.gridx = 0;
        gC.gridy = 1;
        getContentPane().add(ageLabel,gC);
        
        heightLabel.setText("Height: ");
        gC.gridx = 0;
        gC.gridy = 2;
        getContentPane().add(heightLabel,gC);
        
        weightLabel.setText("Weight: ");
        gC.gridx = 0;
        gC.gridy = 3;
        getContentPane().add(weightLabel,gC);
        
        BMI_Label.setText("BMI: ");
        gC.gridx = 0;
        gC.gridy = 4;
        getContentPane().add(BMI_Label,gC);
        
        nameTF.setText("");
        nameTF.setColumns(20);
        gC.gridx = 1;
        gC.gridy = 0;
        getContentPane().add(nameTF,gC);
        
        ageTF.setText("");
        ageTF.setColumns(10);
        gC.gridx = 1;
        gC.gridy = 1;
        getContentPane().add(ageTF,gC);
        
        heightTF.setText("");
        heightTF.setColumns(10);
        gC.gridx = 1;
        gC.gridy = 2;
        getContentPane().add(heightTF,gC);
        
        weightTF.setText("");
        weightTF.setColumns(10);
        gC.gridx = 1;
        gC.gridy = 3;
        getContentPane().add(weightTF,gC);
        
        BMI_TF.setText("");
        BMI_TF.setColumns(10);
        gC.gridx = 1;
        gC.gridy = 4;
        getContentPane().add(BMI_TF,gC);
        
        inchesLabel.setText("inches");
        gC.gridx = 2;
        gC.gridy = 2;
        getContentPane().add(inchesLabel,gC);
        
        poundsLabel.setText("pounds");
        gC.gridx = 2;
        gC.gridy = 3;
        getContentPane().add(poundsLabel,gC);
        
        computeBMIButton.setText("Compute BMI");
        gC.gridx = 0;
        gC.gridy = 5;
        getContentPane().add(computeBMIButton,gC);
        
        clearButton.setText("Clear");
        gC.gridx = 1;
        gC.gridy = 5;
        getContentPane().add(clearButton,gC);
        
        exitButton.setText("Exit");
        gC.gridx = 2;
        gC.gridy = 5;
        getContentPane().add(exitButton,gC);
        pack();
        
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });  
        computeBMIButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                computeBMIButtonActionPerformed(e);
            }
        });
        
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearButtonActionPerformed(e);
            }
        });
        
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
        
    }
    
    public void exitForm(WindowEvent e){
        System.exit(0);
    }
    
    public void computeBMIButtonActionPerformed(ActionEvent e){
        double height = Double.parseDouble(heightTF.getText());
        double weight = Double.parseDouble(weightTF.getText());
        double BMI = (weight / (height * height)) * 703;
        String BMI_Rounded = String.format("%.2f", BMI);
        BMI_TF.setText(BMI_Rounded);
    }
    
    public void clearButtonActionPerformed(ActionEvent e){
        nameTF.setText("");
        ageTF.setText("");
        heightTF.setText("");
        weightTF.setText("");
        BMI_TF.setText("");
    }
    
    public void exitButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String args[]){
        new BMI().show();
    }
}
