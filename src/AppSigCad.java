import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AppSigCad extends JFrame {

    public AppSigCad() {
        super();
        setTitle("SIG - Sistema de Gerenciamento Inteligente");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTabbedPane tbPanel = new JTabbedPane();
        tbPanel.setSize(745, 500);
        tbPanel.setLocation(20, 10);
        add(tbPanel);

        // ==================== Painel Cliente ====================
        JPanel pnlCliente = new JPanel();
        pnlCliente.setLayout(null);
        tbPanel.addTab("Cliente", pnlCliente);

        String[] colunasCliente = {"Matrícula", "Nome", "Telefone", "Email"};
        DefaultTableModel modeloCliente = new DefaultTableModel(colunasCliente, 0);
        JTable tabelaCliente = new JTable(modeloCliente);
        JScrollPane scrollCliente = new JScrollPane(tabelaCliente);
        scrollCliente.setBounds(20, 20, 700, 150);
        pnlCliente.add(scrollCliente);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(20, 190, 80, 25);
        pnlCliente.add(lblMatricula);
        JTextField txtMatricula = new JTextField();
        txtMatricula.setBounds(100, 190, 150, 25);
        pnlCliente.add(txtMatricula);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(270, 190, 80, 25);
        pnlCliente.add(lblNome);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(330, 190, 200, 25);
        pnlCliente.add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 230, 80, 25);
        pnlCliente.add(lblTelefone);
        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 230, 150, 25);
        pnlCliente.add(txtTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(270, 230, 80, 25);
        pnlCliente.add(lblEmail);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(330, 230, 200, 25);
        pnlCliente.add(txtEmail);

        JButton btnLimparCliente = new JButton("Limpar");
        btnLimparCliente.setBounds(550, 190, 100, 25);
        pnlCliente.add(btnLimparCliente);
        JButton btnSalvarCliente = new JButton("Salvar");
        btnSalvarCliente.setBounds(550, 230, 100, 25);
        pnlCliente.add(btnSalvarCliente);

        btnLimparCliente.addActionListener(e -> {
            txtMatricula.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
        });

        btnSalvarCliente.addActionListener(e -> {
            String[] linha = {
                txtMatricula.getText(),
                txtNome.getText(),
                txtTelefone.getText(),
                txtEmail.getText()
            };
            modeloCliente.addRow(linha);
            txtMatricula.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
        });

        // ==================== Painel Produto ====================
        JPanel pnlProduto = new JPanel();
        pnlProduto.setLayout(null);
        tbPanel.addTab("Produto", pnlProduto);

        String[] colunasProduto = {"Código", "Descrição", "Preço", "Quantidade"};
        DefaultTableModel modeloProduto = new DefaultTableModel(colunasProduto, 0);
        JTable tabelaProduto = new JTable(modeloProduto);
        JScrollPane scrollProduto = new JScrollPane(tabelaProduto);
        scrollProduto.setBounds(20, 20, 700, 150);
        pnlProduto.add(scrollProduto);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 190, 80, 25);
        pnlProduto.add(lblCodigo);
        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(100, 190, 150, 25);
        pnlProduto.add(txtCodigo);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(270, 190, 80, 25);
        pnlProduto.add(lblDescricao);
        JTextField txtDescricao = new JTextField();
        txtDescricao.setBounds(350, 190, 200, 25);
        pnlProduto.add(txtDescricao);

        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(20, 230, 80, 25);
        pnlProduto.add(lblPreco);
        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(100, 230, 150, 25);
        pnlProduto.add(txtPreco);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(270, 230, 80, 25);
        pnlProduto.add(lblQuantidade);
        JTextField txtQuantidade = new JTextField();
        txtQuantidade.setBounds(350, 230, 200, 25);
        pnlProduto.add(txtQuantidade);

        JButton btnLimparProduto = new JButton("Limpar");
        btnLimparProduto.setBounds(580, 190, 100, 25);
        pnlProduto.add(btnLimparProduto);
        JButton btnSalvarProduto = new JButton("Salvar");
        btnSalvarProduto.setBounds(580, 230, 100, 25);
        pnlProduto.add(btnSalvarProduto);

        btnLimparProduto.addActionListener(e -> {
            txtCodigo.setText("");
            txtDescricao.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
        });

        btnSalvarProduto.addActionListener(e -> {
            String[] linha = {
                txtCodigo.getText(),
                txtDescricao.getText(),
                txtPreco.getText(),
                txtQuantidade.getText()
            };
            modeloProduto.addRow(linha);
            txtCodigo.setText("");
            txtDescricao.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
        });

        // ==================== Painel Fornecedor ====================
        JPanel pnlFornecedor = new JPanel();
        pnlFornecedor.setLayout(null);
        tbPanel.addTab("Fornecedor", pnlFornecedor);

        String[] colunasFornecedor = {"CNPJ", "Nome", "Telefone", "Email"};
        DefaultTableModel modeloFornecedor = new DefaultTableModel(colunasFornecedor, 0);
        JTable tabelaFornecedor = new JTable(modeloFornecedor);
        JScrollPane scrollFornecedor = new JScrollPane(tabelaFornecedor);
        scrollFornecedor.setBounds(20, 20, 700, 150);
        pnlFornecedor.add(scrollFornecedor);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(20, 190, 80, 25);
        pnlFornecedor.add(lblCNPJ);
        JTextField txtCNPJ = new JTextField();
        txtCNPJ.setBounds(100, 190, 150, 25);
        pnlFornecedor.add(txtCNPJ);

        JLabel lblNomeForn = new JLabel("Nome:");
        lblNomeForn.setBounds(270, 190, 80, 25);
        pnlFornecedor.add(lblNomeForn);
        JTextField txtNomeForn = new JTextField();
        txtNomeForn.setBounds(350, 190, 200, 25);
        pnlFornecedor.add(txtNomeForn);

        JLabel lblTelefoneForn = new JLabel("Telefone:");
        lblTelefoneForn.setBounds(20, 230, 80, 25);
        pnlFornecedor.add(lblTelefoneForn);
        JTextField txtTelefoneForn = new JTextField();
        txtTelefoneForn.setBounds(100, 230, 150, 25);
        pnlFornecedor.add(txtTelefoneForn);

        JLabel lblEmailForn = new JLabel("Email:");
        lblEmailForn.setBounds(270, 230, 80, 25);
        pnlFornecedor.add(lblEmailForn);
        JTextField txtEmailForn = new JTextField();
        txtEmailForn.setBounds(350, 230, 200, 25);
        pnlFornecedor.add(txtEmailForn);

        JButton btnLimparFornecedor = new JButton("Limpar");
        btnLimparFornecedor.setBounds(580, 190, 100, 25);
        pnlFornecedor.add(btnLimparFornecedor);
        JButton btnSalvarFornecedor = new JButton("Salvar");
        btnSalvarFornecedor.setBounds(580, 230, 100, 25);
        pnlFornecedor.add(btnSalvarFornecedor);

        btnLimparFornecedor.addActionListener(e -> {
            txtCNPJ.setText("");
            txtNomeForn.setText("");
            txtTelefoneForn.setText("");
            txtEmailForn.setText("");
        });

        btnSalvarFornecedor.addActionListener(e -> {
            String[] linha = {
                txtCNPJ.getText(),
                txtNomeForn.getText(),
                txtTelefoneForn.getText(),
                txtEmailForn.getText()
            };
            modeloFornecedor.addRow(linha);
            txtCNPJ.setText("");
            txtNomeForn.setText("");
            txtTelefoneForn.setText("");
            txtEmailForn.setText("");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AppSigCad();
    }
}