import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sample {
    public static void main(String[] args) {
        // フレームの作成
        JFrame frame = new JFrame("ログイン画面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // メインパネルの作成 (コンポーネントを縦に並べる)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 余白を追加

        // ID入力欄
        JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField(15);
        idPanel.add(idLabel);
        idPanel.add(idField);

        // パスワード入力欄
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel passwordLabel = new JLabel("パスワード:");
        JPasswordField passwordField = new JPasswordField(15);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // ログインボタン
        JPanel buttonPanel = new JPanel();
        JButton loginButton = new JButton("ログイン");
        buttonPanel.add(loginButton);

        // コンポーネントをパネルに追加
        panel.add(idPanel);
        panel.add(passwordPanel);
        panel.add(buttonPanel);

        // フレームにパネルを追加
        frame.add(panel, BorderLayout.CENTER);

        // フレームを表示
        frame.setVisible(true);
    }
}