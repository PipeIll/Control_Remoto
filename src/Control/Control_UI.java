package Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_UI {
    private JButton ButtonVOLMinus;
    private JButton ButtonCHBehind;
    private JButton ButtonVOLPlus;
    private JButton ButtonCHForward;
    private JButton a2Button1;
    private JButton a3Button;
    private JButton a1Button1;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton Power;
    private JButton buttonUp;
    private JButton OKButton;
    private JButton buttonDown;
    private JButton buttonRight;
    private JButton buttonLeft;
    private JButton a0Button;
    private JComboBox<InputSourceTV> comboBoxInput;
    private JLabel ch_text;
    private JLabel vol_text;
    private JProgressBar volProgress;
    private JLabel inputSource;
    private JPanel mainPanel;
    private JPanel PowerLed;
    private JLabel Power_name;

    public int vol = 0;
    public int channel = 0;
    public String number = "";

    private void presionarNumero(String digito) {
        if (number.length() >= 3) {
            number = digito;
        } else {
            number = number + digito;
        }

        ch_text.setText(number);
        channel = Integer.parseInt(number);
    }

    public Control_UI() {
        a1Button1.addActionListener(e -> presionarNumero("1"));
        a2Button1.addActionListener(e -> presionarNumero("2"));
        a3Button.addActionListener(e -> presionarNumero("3"));
        a4Button.addActionListener(e -> presionarNumero("4"));
        a5Button.addActionListener(e -> presionarNumero("5"));
        a6Button.addActionListener(e -> presionarNumero("6"));
        a7Button.addActionListener(e -> presionarNumero("7"));
        a8Button.addActionListener(e -> presionarNumero("8"));
        a9Button.addActionListener(e -> presionarNumero("9"));
        a0Button.addActionListener(e -> presionarNumero("0"));

        volProgress.setMinimum(0);
        volProgress.setMaximum(10);
        volProgress.setValue(vol);
        comboBoxInput.setModel(new DefaultComboBoxModel<>(InputSourceTV.values()));
        ButtonVOLMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vol> 0){
                    vol = vol - 1;
                    vol_text.setText(String.valueOf(vol));}
                else {
                    vol = 0;
                    vol_text.setText(String.valueOf(vol));
                }volProgress.setValue(vol);
            }
        });
        ButtonVOLPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vol< 10){
                    vol = vol + 1;
                    vol_text.setText(String.valueOf(vol));}
                else {
                    vol = 10;
                    vol_text.setText(String.valueOf(vol));
                } volProgress.setValue(vol);
            }
        });
        ButtonCHBehind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (channel> 0){
                    channel = channel - 1;
                    ch_text.setText(String.valueOf(channel));}
                else {
                    channel = 0;
                    ch_text.setText(String.valueOf(channel));
                }
            }
        });
        ButtonCHForward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (channel< 999){
                    channel = channel + 1;
                    ch_text.setText(String.valueOf(channel));}
                else {
                    channel = 999;
                    ch_text.setText(String.valueOf(channel));
                }
            }
        });
        Power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PowerLed.setBackground(new Color(20, 90, 50));
            }
        });
        comboBoxInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputSourceTV selected = (InputSourceTV) comboBoxInput.getSelectedItem();
                inputSource.setText(selected.name());

                switch (selected)
                {
                    case AV -> inputSource.setForeground(Color.BLACK);
                    case Netflix -> inputSource.setForeground(Color.BLUE);
                    case HBO -> inputSource.setForeground(Color.RED);
                    case Youtube -> inputSource.setForeground(Color.GREEN);
                    case RTVC -> inputSource.setForeground(Color.YELLOW);
                    case HDMI -> inputSource.setForeground(Color.CYAN);
                    case WIFI -> inputSource.setForeground(Color.PINK);
                }
            }
        });
    }
    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
