
package Interfaz;//paquete interfaz


public class cachoJuegoAlalay extends javax.swing.JFrame {
//inicio de la clase

    String opcion;//esta es para las opciones del menu
    String D1;//Dado 1 en formato String
    String D2;//Dado 2 en formato String 
    String D3;//Dado 3 en formato String
    String D4;//Dado 4 en formato String
    String D5;//Dado 5 en formato String
    public int turno;//un entero que controla los turnos
    
        public int volteo;//un entero cnotrola los volteos por turno
        public int mano;//un entero controla si la primera mano o segunda mano
        public int estadoDado1;//un entero que verifica el estado del Dado1
        public int estadoDado2;//un entero que verifica el estado del Dado2
        public int estadoDado3;//un entero que verifica el estado del Dado3
        public int estadoDado4;//un entero que verifica el estado del Dado4
        public int estadoDado5;//un entero que verifica el estado del Dado5
    
         JugadorHumano jug1;// declaramos un jugador 1
         JugadorHumano jug2;//declaramos un jugador 2
         JugadorMaquina jugM;//declaramos un jugador maquina
         int controlTipo=1;
         
   Dado miJuego = new Dado();//creamos un objeto tipo dado
   Jugadas miJ ;//creamos un objeto tipo jugada
     public cachoJuegoAlalay(String nombre) 
    {
        //consrtuctor del juego que requiere un nombre tipo String
        initComponents();
        this.setLocationRelativeTo(null);//la pantalla se pocisiona en el medio
        botonTerminar.setVisible(false);//el boton para terminar turno inicia en invisible
        //Instruccion.setVisible(false);
        turno=getTurno(2);//etiquetaToca(turno);
        volteo=0;
        mano=0;
        estadoDado1=0;
        estadoDado2=0;
        estadoDado3=0;
        estadoDado4=0;
        estadoDado5=0;
        
        jug1=new JugadorHumano(nombre,0,0);//se declara un objeto tipo jugador humano y mandamos el nombre
        jugM=new JugadorMaquina("JanneE",0,0); //se declara un objeto tipo maquina
        etiquetaNombreJug.setText(nombre);//colocamos el nombre en pantalla
        etiquetaNombreJug1.setText("JanneE");//colocamos el nombre de la maquina en pantalla
        bloquearNumDados(2);//se bloquean los botones de los dados
        bloquearJugadas();
        anularEtiquetasFinal();
   
    }
    public cachoJuegoAlalay(int a, String nombre1,String nombre2)//constructor de la clase sobrecargado 
    {
        //segundo constructor requiere dos nombres y un int
        initComponents();
        this.setLocationRelativeTo(null);//coloca la pantalla en el medio
        botonTerminar.setVisible(false);//boton terminar turno en false
        //Instruccion.setVisible(false);//pone una etiqueta de instruccion en la pantalla
        InstruccionDeJugadas.setVisible(false);//etiqueta que inicia sin verse
        turno=getTurno(2);//etiqueta turno
        
        volteo=0;
        mano=0;
        estadoDado1=0;
        estadoDado2=0;
        estadoDado3=0;
        estadoDado4=0;
        estadoDado5=0;
        
        jug1 = new JugadorHumano(nombre1,0,0); //declaramos el objeto jug1 se le manda un nombre tipo String, un puntaje y una racha
          jug2 = new JugadorHumano(nombre2,0,0);//declaramos el objeto jug2 se le manda un nombre tipo String, un puntaje y una racha
          etiquetaNombreJug.setText(nombre1);//colocamos el nombre en pantalla
          etiquetaNombreJug1.setText(nombre2);//colocamos el nombre en pantalla
          bloquearNumDados(2);//bloquea los botones de los dados para interactuar con ellos
          anularEtiquetasFinal();//anula las etiquetas que se muestran solo cuando acaba el juego
          bloquearJugadas();
         controlTipo=a;
    }
    
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        popupMenu1 = new java.awt.PopupMenu();
        resultados = new javax.swing.JLabel();
        res1 = new javax.swing.JLabel();
        res2 = new javax.swing.JLabel();
        SalirFin = new javax.swing.JButton();
        ganador = new javax.swing.JLabel();
        pergamino = new javax.swing.JLabel();
        botonTirar = new javax.swing.JButton();
        botonTerminar = new javax.swing.JButton();
        botonCuadras = new javax.swing.JButton();
        botonTrenes = new javax.swing.JButton();
        botonBala = new javax.swing.JButton();
        botonTonto = new javax.swing.JButton();
        botonQuinas = new javax.swing.JButton();
        botonCenas = new javax.swing.JButton();
        botonEscalera = new javax.swing.JButton();
        botonFull = new javax.swing.JButton();
        BotonPoker = new javax.swing.JButton();
        botonGrande = new javax.swing.JButton();
        botonDado5 = new javax.swing.JButton();
        botonDado1 = new javax.swing.JButton();
        botonDado2 = new javax.swing.JButton();
        botonDado3 = new javax.swing.JButton();
        botonDado4 = new javax.swing.JButton();
        Marco = new javax.swing.JLabel();
        etiquetaDado11 = new javax.swing.JLabel();
        etiquetaDado21 = new javax.swing.JLabel();
        etiquetaDado31 = new javax.swing.JLabel();
        etiquetaDado41 = new javax.swing.JLabel();
        etiquetaDado51 = new javax.swing.JLabel();
        Menu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        toca = new javax.swing.JLabel();
        lblPuntaje1 = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        etiquetaNombreJug1 = new javax.swing.JLabel();
        etiquetaPuntaje1 = new javax.swing.JLabel();
        etiquetaEscalera1 = new javax.swing.JLabel();
        etiquetaBala1 = new javax.swing.JLabel();
        etiquetaTrenes1 = new javax.swing.JLabel();
        etiquetaTonto1 = new javax.swing.JLabel();
        etiquetaPoker1 = new javax.swing.JLabel();
        etiquetaCuadra1 = new javax.swing.JLabel();
        etiquetaFull1 = new javax.swing.JLabel();
        etiquetaQuina1 = new javax.swing.JLabel();
        etiquetaCenas1 = new javax.swing.JLabel();
        etiquetaGrande3 = new javax.swing.JLabel();
        etiquetaGrande4 = new javax.swing.JLabel();
        etiquetaNombreJug = new javax.swing.JLabel();
        etiquetaPuntaje = new javax.swing.JLabel();
        etiquetaEscalera = new javax.swing.JLabel();
        etiquetaBala = new javax.swing.JLabel();
        etiquetaTrenes = new javax.swing.JLabel();
        etiquetaTonto = new javax.swing.JLabel();
        etiquetaPoker = new javax.swing.JLabel();
        etiquetaCuadra = new javax.swing.JLabel();
        etiquetaFull = new javax.swing.JLabel();
        etiquetaQuina = new javax.swing.JLabel();
        etiquetaCenas = new javax.swing.JLabel();
        etiquetaGrande1 = new javax.swing.JLabel();
        etiquetaGrande2 = new javax.swing.JLabel();
        papel1 = new javax.swing.JLabel();
        papel = new javax.swing.JLabel();
        InstruccionDeJugadas = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultados.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        resultados.setText("Resultados Finales");
        getContentPane().add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 430, 30));

        res1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        getContentPane().add(res1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, 30));

        res2.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        getContentPane().add(res2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 220, 30));

        SalirFin.setBackground(new java.awt.Color(0, 0, 0));
        SalirFin.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        SalirFin.setForeground(new java.awt.Color(204, 204, 204));
        SalirFin.setText("Salir");
        SalirFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirFinActionPerformed(evt);
            }
        });
        getContentPane().add(SalirFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 240, 40));

        ganador.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        getContentPane().add(ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 500, 80));

        pergamino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/pergamino.gif"))); // NOI18N
        getContentPane().add(pergamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 770, 470));

        botonTirar.setBackground(new java.awt.Color(51, 0, 0));
        botonTirar.setFont(new java.awt.Font("xscale", 1, 14)); // NOI18N
        botonTirar.setForeground(new java.awt.Color(204, 204, 204));
        botonTirar.setText("Tirar Dados");
        botonTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTirarActionPerformed(evt);
            }
        });
        getContentPane().add(botonTirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 130, 50));

        botonTerminar.setBackground(new java.awt.Color(51, 0, 0));
        botonTerminar.setFont(new java.awt.Font("xscale", 1, 12)); // NOI18N
        botonTerminar.setForeground(new java.awt.Color(255, 255, 255));
        botonTerminar.setText("Terminar Turno");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 130, 50));

        botonCuadras.setBackground(new java.awt.Color(0, 0, 0));
        botonCuadras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonCuadras.setForeground(new java.awt.Color(255, 255, 255));
        botonCuadras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonCuadras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 110, 20));

        botonTrenes.setBackground(new java.awt.Color(0, 0, 0));
        botonTrenes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonTrenes.setForeground(new java.awt.Color(255, 255, 255));
        botonTrenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrenesActionPerformed(evt);
            }
        });
        getContentPane().add(botonTrenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 110, 20));

        botonBala.setBackground(new java.awt.Color(0, 0, 0));
        botonBala.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBala.setForeground(new java.awt.Color(255, 255, 255));
        botonBala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBalaActionPerformed(evt);
            }
        });
        getContentPane().add(botonBala, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 110, 20));

        botonTonto.setBackground(new java.awt.Color(0, 0, 0));
        botonTonto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonTonto.setForeground(new java.awt.Color(255, 255, 255));
        botonTonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTontoActionPerformed(evt);
            }
        });
        getContentPane().add(botonTonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, 20));

        botonQuinas.setBackground(new java.awt.Color(0, 0, 0));
        botonQuinas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonQuinas.setForeground(new java.awt.Color(255, 255, 255));
        botonQuinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuinasActionPerformed(evt);
            }
        });
        getContentPane().add(botonQuinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 110, 20));

        botonCenas.setBackground(new java.awt.Color(0, 0, 0));
        botonCenas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonCenas.setForeground(new java.awt.Color(255, 255, 255));
        botonCenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCenasActionPerformed(evt);
            }
        });
        getContentPane().add(botonCenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 110, 20));

        botonEscalera.setBackground(new java.awt.Color(0, 0, 0));
        botonEscalera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEscalera.setForeground(new java.awt.Color(255, 255, 255));
        botonEscalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEscaleraActionPerformed(evt);
            }
        });
        getContentPane().add(botonEscalera, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 110, 20));

        botonFull.setBackground(new java.awt.Color(0, 0, 0));
        botonFull.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonFull.setForeground(new java.awt.Color(255, 255, 255));
        botonFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFullActionPerformed(evt);
            }
        });
        getContentPane().add(botonFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 110, 20));

        BotonPoker.setBackground(new java.awt.Color(0, 0, 0));
        BotonPoker.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonPoker.setForeground(new java.awt.Color(255, 255, 255));
        BotonPoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokerActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPoker, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 110, 20));

        botonGrande.setBackground(new java.awt.Color(0, 0, 0));
        botonGrande.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGrande.setForeground(new java.awt.Color(255, 255, 255));
        botonGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrandeActionPerformed(evt);
            }
        });
        getContentPane().add(botonGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 110, 20));

        botonDado5.setBackground(new java.awt.Color(255, 0, 0));
        botonDado5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDado5.setForeground(new java.awt.Color(255, 255, 255));
        botonDado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDado5ActionPerformed(evt);
            }
        });
        getContentPane().add(botonDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 60, 60));

        botonDado1.setBackground(new java.awt.Color(255, 0, 0));
        botonDado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDado1.setForeground(new java.awt.Color(255, 255, 255));
        botonDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDado1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 60, 60));

        botonDado2.setBackground(new java.awt.Color(255, 0, 0));
        botonDado2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDado2.setForeground(new java.awt.Color(255, 255, 255));
        botonDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDado2ActionPerformed(evt);
            }
        });
        getContentPane().add(botonDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 60, 60));

        botonDado3.setBackground(new java.awt.Color(255, 0, 0));
        botonDado3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDado3.setForeground(new java.awt.Color(255, 255, 255));
        botonDado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDado3ActionPerformed(evt);
            }
        });
        getContentPane().add(botonDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 60, 60));

        botonDado4.setBackground(new java.awt.Color(255, 0, 0));
        botonDado4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDado4.setForeground(new java.awt.Color(255, 255, 255));
        botonDado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDado4ActionPerformed(evt);
            }
        });
        getContentPane().add(botonDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 60, 60));

        Marco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/marco2.png"))); // NOI18N
        getContentPane().add(Marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 550, 140));
        getContentPane().add(etiquetaDado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 60, 60));
        getContentPane().add(etiquetaDado21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 60, 60));
        getContentPane().add(etiquetaDado31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 60, 60));
        getContentPane().add(etiquetaDado41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 60, 60));
        getContentPane().add(etiquetaDado51, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 60, 60));

        Menu.setBackground(new java.awt.Color(51, 0, 0));
        Menu.setForeground(new java.awt.Color(204, 204, 204));
        Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salir a Windows", "Salir a Inicio" }));
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Jugadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        toca.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        toca.setForeground(new java.awt.Color(204, 204, 204));
        toca.setText("Turno del Jugador N");
        getContentPane().add(toca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        lblPuntaje1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(lblPuntaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 80, 20));

        lblPuntaje.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(lblPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 60, 20));

        etiquetaNombreJug1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        etiquetaNombreJug1.setText("nombrejugador");
        getContentPane().add(etiquetaNombreJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        etiquetaPuntaje1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        etiquetaPuntaje1.setText("Puntaje:");
        getContentPane().add(etiquetaPuntaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, -1, -1));

        etiquetaEscalera1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaEscalera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 50, 40));

        etiquetaBala1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaBala1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 40, 40));

        etiquetaTrenes1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaTrenes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 40, 40));

        etiquetaTonto1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaTonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 40, 40));

        etiquetaPoker1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaPoker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 40, 40));

        etiquetaCuadra1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaCuadra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 40, 40));

        etiquetaFull1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaFull1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 40, 40));

        etiquetaQuina1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaQuina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 40, 40));

        etiquetaCenas1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaCenas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, 40, 40));

        etiquetaGrande3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaGrande3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 50, 20));

        etiquetaGrande4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaGrande4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 50, 20));

        etiquetaNombreJug.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        etiquetaNombreJug.setText("nombrejugador");
        getContentPane().add(etiquetaNombreJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        etiquetaPuntaje.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        etiquetaPuntaje.setText("Puntaje:");
        getContentPane().add(etiquetaPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        etiquetaEscalera.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaEscalera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 50, 40));

        etiquetaBala.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaBala, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, 40));

        etiquetaTrenes.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaTrenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 40, 40));

        etiquetaTonto.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaTonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, 40));

        etiquetaPoker.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaPoker, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 40, 40));

        etiquetaCuadra.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaCuadra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, 40));

        etiquetaFull.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 40, 40));

        etiquetaQuina.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaQuina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 40, 40));

        etiquetaCenas.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(etiquetaCenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 40, 40));

        etiquetaGrande1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaGrande1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 50, 20));

        etiquetaGrande2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        getContentPane().add(etiquetaGrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, 20));

        papel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/Paper_1.png"))); // NOI18N
        getContentPane().add(papel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 240, -1));

        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/Paper_1.png"))); // NOI18N
        getContentPane().add(papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, -1));

        InstruccionDeJugadas.setFont(new java.awt.Font("xscale", 1, 18)); // NOI18N
        InstruccionDeJugadas.setForeground(new java.awt.Color(255, 255, 255));
        InstruccionDeJugadas.setText("Por Favor seleccione un dado para voltear");
        getContentPane().add(InstruccionDeJugadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 400, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/MesaOriginal2.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1120, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTirarActionPerformed
     if(controlTipo==1)
     {lanzamientoUnJugador();
     }
     else
     {lanzamientoDosJugadores();
     }
    }//GEN-LAST:event_botonTirarActionPerformed

    
    private void botonDado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDado2ActionPerformed
        //acciones para el boton dado 2.
        if(mano == 1)
        {
            bloquearJugadas();
            botonDado2.setEnabled(false);
            estadoDado2=1;
            botonTirar.setEnabled(true);
        }
        if(mano == 2)
        {
            volteo++;
            miJuego.voltearDado2();
            D2=miJuego.devolverDado2();//devuelve el numero que salio en el dado 1 en tipo String
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            mostrarNumeroDados();
            miJ.reestablecerJugadas(miJuego.devolverTodos());
            mostrarJugadas();//invocamos al metodo mostrar Jugadas 
        }
        bloquearNumDados(volteo);
         
        InstruccionDeJugadas.setVisible(false);  
        //mostrarJugadas();//invocamos al metodo mostrar Jugadas
    }//GEN-LAST:event_botonDado2ActionPerformed

    private void botonDado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDado3ActionPerformed
        if(mano == 1)
        {
            bloquearJugadas();
            botonDado3.setEnabled(false);
            estadoDado3=1;
            botonTirar.setEnabled(true);
        }
        if(mano == 2)
        {
            volteo++;
            miJuego.voltearDado3();
            D3=miJuego.devolverDado3();//devuelve el numero que salio en el dado 1 en tipo String
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            mostrarNumeroDados();
            miJ.reestablecerJugadas(miJuego.devolverTodos());
            mostrarJugadas();//invocamos al metodo mostrar Jugadas  
        }
        
        bloquearNumDados(volteo);
        
        InstruccionDeJugadas.setVisible(false);  
        //mostrarJugadas();//invocamos al metodo mostrar Jugadas
    }//GEN-LAST:event_botonDado3ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
         decision();
    }//GEN-LAST:event_MenuActionPerformed

    private void botonDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDado1ActionPerformed
        if(mano == 1)
        {
            bloquearJugadas();
            botonDado1.setEnabled(false);
            estadoDado1=1;
            botonTirar.setEnabled(true);
        }
        if(mano == 2)
        {
            volteo++;
            miJuego.voltearDado1();
            D1=miJuego.devolverDado1();//devuelve el numero que salio en el dado 1 en tipo String
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            mostrarNumeroDados();
            miJ.reestablecerJugadas(miJuego.devolverTodos());
            mostrarJugadas();//invocamos al metodo mostrar Jugadas  
        }
        
        
        bloquearNumDados(volteo);
        
        InstruccionDeJugadas.setVisible(false); 
    }//GEN-LAST:event_botonDado1ActionPerformed

    private void botonBalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBalaActionPerformed
        juegaBalas();
    }//GEN-LAST:event_botonBalaActionPerformed

    private void botonTontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTontoActionPerformed
        juegaTontos();
    }//GEN-LAST:event_botonTontoActionPerformed

    private void botonTrenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrenesActionPerformed
       juegaTrenes();
    }//GEN-LAST:event_botonTrenesActionPerformed

    private void botonCuadrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadrasActionPerformed
        juegaCuadras();
    }//GEN-LAST:event_botonCuadrasActionPerformed

    private void botonQuinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuinasActionPerformed
        juegaQuinas();   
    }//GEN-LAST:event_botonQuinasActionPerformed

    private void botonCenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCenasActionPerformed
       juegaCenas();
    }//GEN-LAST:event_botonCenasActionPerformed

    private void botonEscaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEscaleraActionPerformed
          
       juegaEscalera();
    }//GEN-LAST:event_botonEscaleraActionPerformed

    private void botonDado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDado5ActionPerformed
        if(mano == 1)
        {
            bloquearJugadas();
            botonDado5.setEnabled(false);
            estadoDado5=1;
            botonTirar.setEnabled(true);
        }
        if(mano == 2)
        {
            volteo++;
            miJuego.voltearDado5();
            D5=miJuego.devolverDado5();//devuelve el numero que salio en el dado 1 en tipo String
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            mostrarNumeroDados();
            miJ.reestablecerJugadas(miJuego.devolverTodos());
            mostrarJugadas();//invocamos al metodo mostrar Jugadas  
        }
        
        bloquearNumDados(volteo);
       
        InstruccionDeJugadas.setVisible(false);  
        //mostrarJugadas();//invocamos al metodo mostrar Jugadas
    }//GEN-LAST:event_botonDado5ActionPerformed

    private void BotonPokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokerActionPerformed
       juegaPoker();
    }//GEN-LAST:event_BotonPokerActionPerformed

    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
    if(controlTipo==1)
    {if(turno%2==0)
     {terminarParaDosJugadores();
      miJuego.tirarDado();
      miJ.reestablecerJugadas(miJuego.devolverTodos());
      boolean [] E=miJ.getCajaE();
       String [] N=miJ.getCajaN();
       int R=jugM.decidirJugada(E, N);
       maquinaJuega(R);//en este metodo la maquina da su jugada
       terminarParaDosJugadores();
     }
     
    }
    else
    {terminarParaDosJugadores();
    }
        
    }//GEN-LAST:event_botonTerminarActionPerformed

    private void botonFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFullActionPerformed
        juegaFull();
    }//GEN-LAST:event_botonFullActionPerformed

    private void botonGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrandeActionPerformed
        juegaGrande();
    }//GEN-LAST:event_botonGrandeActionPerformed

    private void botonDado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDado4ActionPerformed
        if(mano == 1)
        {
            bloquearJugadas();
            botonDado4.setEnabled(false);
            estadoDado4=1;
            botonTirar.setEnabled(true);
        }
        if(mano == 2)
        {
            volteo++;
            miJuego.voltearDado4();
            D4=miJuego.devolverDado4();//devuelve el numero que salio en el dado 1 en tipo String
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            mostrarNumeroDados();
            miJ.reestablecerJugadas(miJuego.devolverTodos());
            mostrarJugadas();//invocamos al metodo mostrar Jugadas 
        }
        
        bloquearNumDados(volteo);
         
        InstruccionDeJugadas.setVisible(false);  
        //mostrarJugadas();//invocamos al metodo mostrar Jugadas
    }//GEN-LAST:event_botonDado4ActionPerformed

    private void SalirFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirFinActionPerformed
        //eventos para el boton que sale al final del juego 
        Inicio miInicio=new Inicio();//creamos un objeto tipo modalidad JFrame
        miInicio.setVisible(true);//se abre la nueva ventana
        this.dispose();
    }//GEN-LAST:event_SalirFinActionPerformed
    private void decision()
    {opcion = Menu.getSelectedItem().toString();
      if(opcion.equals("Salir a Windows"))
      {
          System.exit(0);
      }
      else
      {if(opcion.equals("Salir a Inicio"))
       {
            Inicio miInicio=new Inicio();//creamos un objeto tipo modalidad JFrame
            miInicio.setVisible(true);//se abre la nueva ventana
            this.dispose();
       }
      }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cachoJuegoAlalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cachoJuegoAlalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cachoJuegoAlalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cachoJuegoAlalay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new cachoJuegoAlalay(0,"","").setVisible(true);
            
        }); 
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPoker;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel InstruccionDeJugadas;
    private javax.swing.JLabel Marco;
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JButton SalirFin;
    private javax.swing.JButton botonBala;
    private javax.swing.JButton botonCenas;
    private javax.swing.JButton botonCuadras;
    private javax.swing.JButton botonDado1;
    private javax.swing.JButton botonDado2;
    private javax.swing.JButton botonDado3;
    private javax.swing.JButton botonDado4;
    private javax.swing.JButton botonDado5;
    private javax.swing.JButton botonEscalera;
    private javax.swing.JButton botonFull;
    private javax.swing.JButton botonGrande;
    private javax.swing.JButton botonQuinas;
    private javax.swing.JButton botonTerminar;
    private javax.swing.JButton botonTirar;
    private javax.swing.JButton botonTonto;
    private javax.swing.JButton botonTrenes;
    private javax.swing.JLabel etiquetaBala;
    private javax.swing.JLabel etiquetaBala1;
    private javax.swing.JLabel etiquetaCenas;
    private javax.swing.JLabel etiquetaCenas1;
    private javax.swing.JLabel etiquetaCuadra;
    private javax.swing.JLabel etiquetaCuadra1;
    private javax.swing.JLabel etiquetaDado11;
    private javax.swing.JLabel etiquetaDado21;
    private javax.swing.JLabel etiquetaDado31;
    private javax.swing.JLabel etiquetaDado41;
    private javax.swing.JLabel etiquetaDado51;
    private javax.swing.JLabel etiquetaEscalera;
    private javax.swing.JLabel etiquetaEscalera1;
    private javax.swing.JLabel etiquetaFull;
    private javax.swing.JLabel etiquetaFull1;
    private javax.swing.JLabel etiquetaGrande1;
    private javax.swing.JLabel etiquetaGrande2;
    private javax.swing.JLabel etiquetaGrande3;
    private javax.swing.JLabel etiquetaGrande4;
    private javax.swing.JLabel etiquetaNombreJug;
    private javax.swing.JLabel etiquetaNombreJug1;
    private javax.swing.JLabel etiquetaPoker;
    private javax.swing.JLabel etiquetaPoker1;
    private javax.swing.JLabel etiquetaPuntaje;
    private javax.swing.JLabel etiquetaPuntaje1;
    private javax.swing.JLabel etiquetaQuina;
    private javax.swing.JLabel etiquetaQuina1;
    private javax.swing.JLabel etiquetaTonto;
    private javax.swing.JLabel etiquetaTonto1;
    private javax.swing.JLabel etiquetaTrenes;
    private javax.swing.JLabel etiquetaTrenes1;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntaje1;
    private javax.swing.JLabel papel;
    private javax.swing.JLabel papel1;
    private javax.swing.JLabel pergamino;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel res1;
    private javax.swing.JLabel res2;
    private javax.swing.JLabel resultados;
    private javax.swing.JLabel toca;
    // End of variables declaration//GEN-END:variables

    private void mostrarDados(String D1, String D2, String D3, String D4, String D5) {
        if(D1.equals("1"))
        {
            etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png")));
        }
        else
        {
           if(D1.equals("2"))
           {
             etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png")));
           }
           else
           {
                if(D1.equals("3"))
              {
                 etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado3.png")));
              }
              else
              {
                   if(D1.equals("4"))
                   {
                    etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado4.png")));
                   }
                    if(D1.equals("5"))
                    {
                     etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado5.png")));
                    }
                    else
                    {
                         if(D1.equals("6"))
                         {
                          etiquetaDado11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado6.png")));
                         }
                         
                         
                    }
              }
           }
        } 
        if(D2.equals("1"))
        {
            etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png")));
        }
        else
        {
           if(D2.equals("2"))
           {
             etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png")));
           }
           else
           {
                if(D2.equals("3"))
              {
                 etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado3.png")));
              }
              else
              {
                   if(D2.equals("4"))
                   {
                    etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado4.png")));
                   }
                    if(D2.equals("5"))
                    {
                     etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado5.png")));
                    }
                    else
                    {
                         if(D2.equals("6"))
                         {
                          etiquetaDado21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado6.png")));
                         }
                         
                         
                    }
              }
           }
        } 
        if(D3.equals("1"))
        {
            etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png")));
        }
        else
        {
           if(D3.equals("2"))
           {
             etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png")));
           }
           else
           {
                if(D3.equals("3"))
              {
                 etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado3.png")));
              }
              else
              {
                   if(D3.equals("4"))
                   {
                    etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado4.png")));
                   }
                    if(D3.equals("5"))
                    {
                     etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado5.png")));
                    }
                    else
                    {
                         if(D3.equals("6"))
                         {
                          etiquetaDado31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado6.png")));
                         }
                         
                         
                    }
              }
           }
        } 
        if(D4.equals("1"))
        {
            etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png")));
        }
        else
        {
           if(D4.equals("2"))
           {
             etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png")));
           }
           else
           {
                if(D4.equals("3"))
              {
                 etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado3.png")));
              }
              else
              {
                   if(D4.equals("4"))
                   {
                    etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado4.png")));
                   }
                    if(D4.equals("5"))
                    {
                     etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado5.png")));
                    }
                    else
                    {
                         if(D4.equals("6"))
                         {
                          etiquetaDado41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado6.png")));
                         }
                         
                         
                    }
              }
           }
        } 
        if(D5.equals("1"))
        {
            etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado1.png")));
        }
        else
        {
           if(D5.equals("2"))
           {
             etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado2.png")));
           }
           else
           {
                if(D5.equals("3"))
              {
                 etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado3.png")));
              }
              else
              {
                   if(D5.equals("4"))
                   {
                    etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado4.png")));
                   }
                    if(D5.equals("5"))
                    {
                     etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado5.png")));
                    }
                    else
                    {
                         if(D5.equals("6"))
                         {
                          etiquetaDado51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tablero/dado6.png")));
                         }
                         
                         
                    }
              }
           }
        }
        
       
    }

    private void mostrarJugadas() //muestra en el J frame todas las jugadas disponibles para el Jugador
    {
        boolean hayJugadas=false;
        if(miJ.getBalas().equals("0") || cualquierJugador().tabla[0]!=0)
         {
             if(cualquierJugador().registro[0]==false)
             { botonBala.setText("AnularB");
               botonBala.setVisible(true);
             }
             else
             {
                 botonBala.setVisible(false);
             }
         }    
         else
         {   
              if(cualquierJugador().registro[0]==false)
              {botonBala.setVisible(true);
               botonBala.setText(miJ.getBalas()+" Balas");
               hayJugadas=true;
              }
              else
              {
                  botonBala.setVisible(false);
              }
         }   
         if(miJ.getTontos().equals("0") || cualquierJugador().tabla[1]!=0)
         {
            if(cualquierJugador().registro[1]==false)
            { botonTonto.setText("AnularTn");
              botonTonto.setVisible(true);
            }
            else
            {
                botonTonto.setVisible(false);
            }
         }   
         else
         {  
             if(cualquierJugador().registro[1]==false)
             {botonTonto.setVisible(true);        
              botonTonto.setText(miJ.getTontos()+" Tontos");
              hayJugadas=true;
             }
             else
             {
                 botonTonto.setVisible(false);
             }
         }
         if(miJ.getTrenes().equals("0") || cualquierJugador().tabla[2]!=0)
         {
             if(cualquierJugador().registro[2]==false)
             {botonTrenes.setText("AnularTr");
              botonTrenes.setVisible(true);
             }
             else
             {
                 botonTrenes.setVisible(false);
             }
         }    
         else
         {
             if(cualquierJugador().registro[2]==false)
             {botonTrenes.setVisible(true);
              botonTrenes.setText(miJ.getTrenes()+" Trenes");
              hayJugadas=true;
             }
             else
             {botonTrenes.setVisible(false);
             }
         }
         if(miJ.getCuadras().equals("0") || cualquierJugador().tabla[3]!=0)
         {
             if(cualquierJugador().registro[3]==false)
             {
              botonCuadras.setText("AnularCd");
              botonCuadras.setVisible(true);
             }
             else
             {
              botonCuadras.setVisible(false);
             }
         }    
         else
         {
             if(cualquierJugador().registro[3]==false)
             {botonCuadras.setVisible(true); 
              botonCuadras.setText(miJ.getCuadras()+" Cuadras");
              hayJugadas=true;
             }
             else
             {
                 botonCuadras.setVisible(false);
             }
         }
         if(miJ.getQuinas().equals("0") || cualquierJugador().tabla[4]!=0)
         {
             if(cualquierJugador().registro[4]==false)
             {  botonQuinas.setText("AnularQn");
                botonQuinas.setVisible(true);
             }
             else
             {
                botonQuinas.setVisible(false); 
             }
         }    
         else
         {
             if(cualquierJugador().registro[4]==false)
             { botonQuinas.setVisible(true);
              botonQuinas.setText(miJ.getQuinas()+" Quinas");
              hayJugadas=true;
             }
             else
             { botonQuinas.setVisible(false); 
             }
         }
         if(miJ.getCenas().equals("0") || cualquierJugador().tabla[5]!=0)
         {
             if(cualquierJugador().registro[5]==false)
             {
              botonCenas.setText("AnularCn");
              botonCenas.setVisible(true);
             }
             else
             {
                 botonCenas.setVisible(false);
             }
         }    
         else
         {
             if(cualquierJugador().registro[5]==false)
             { botonCenas.setVisible(true); 
               botonCenas.setText(miJ.getCenas()+" Cenas");
               hayJugadas=true;
             }
             else
             {botonCenas.setVisible(false);
             }
         }
          if(miJ.getEscalera()==false || cualquierJugador().tabla[6]!=0)
         {
             if(cualquierJugador().registro[6]==false)
             {botonEscalera.setText("AnularEsc");
              botonEscalera.setVisible(true);
             }
             else
             {
                 botonEscalera.setVisible(false);
             }
         }    
         else
         {
             if(cualquierJugador().registro[6]==false)
             {botonEscalera.setVisible(true); 
              botonEscalera.setText("Esacalera");
              hayJugadas=true;
             }
             else
             { botonEscalera.setVisible(false);
             }
         }
           if(miJ.getFull()==false || cualquierJugador().tabla[7]!=0)
         {
             if(cualquierJugador().registro[7]==false)
             {
                 botonFull.setText("AnularFull");
                 botonFull.setVisible(true);
             }
             else
             {
               botonFull.setVisible(false);
             }
         }    
         else
         {
             if(cualquierJugador().registro[7]==false)
             {botonFull.setVisible(true); 
              botonFull.setText("Full");
              hayJugadas=true;
             }
             else
             {botonFull.setVisible(false);
             }
         }
         if(miJ.getPoker()==false || cualquierJugador().tabla[8]!=0)
         {
             if(cualquierJugador().registro[8]==false)
             {BotonPoker.setText("AnularPok");
              BotonPoker.setVisible(true);
             }
             else
             {BotonPoker.setVisible(false);
             }
         }
         else
         {
             if(cualquierJugador().registro[8]==false)
             {BotonPoker.setVisible(true);
              BotonPoker.setText("Poker");
              hayJugadas=true;
             }
             else
             {BotonPoker.setVisible(false);
             }
         }
         if(miJ.getGrande()==false)
         {
             if(cualquierJugador().registro[9]==true && cualquierJugador().registro[10]==true)
                {   
                    botonGrande.setVisible(false);
                }
             else
                {
                    botonGrande.setText("AnularGR");
                    botonGrande.setVisible(true);
                }
         }
         else
         { 
             if(cualquierJugador().registro[9]==false || cualquierJugador().registro[10]==false )
             { botonGrande.setVisible(true);
               botonGrande.setText("Grande");
               hayJugadas=true;
             }
             else
             {
                 botonGrande.setVisible(false);
             }
         }
          
    }

    public int getTurno(int turno)
    {
        if((turno%2)==0)
        {
            toca.setText("Turno del Jugador 1");
            //jug1.
        }
        else
        {
            toca.setText("Turno del Jugador 2");
            
        }
        return turno;
    }
    public void bloquearTiro(int mano)
    {
        if(mano ==2)
        {
            botonTirar.setVisible(false);
        }
    }
    public void bloquearJugadas()//bloquea las jugadas del tablero
    {
        botonBala.setVisible(false);
        botonTonto.setVisible(false);
        botonTrenes.setVisible(false);
        botonCuadras.setVisible(false);
        botonQuinas.setVisible(false);
        botonCenas.setVisible(false);
        botonEscalera.setVisible(false);
        botonFull.setVisible(false);
        BotonPoker.setVisible(false);
        botonGrande.setVisible(false);
    }
    public void HabilitarJugadas()
    {
        botonBala.setVisible(true);
        botonTonto.setVisible(true);
        botonTrenes.setVisible(true);
        botonCuadras.setVisible(true);
        botonQuinas.setVisible(true);
        botonCenas.setVisible(true);
        botonEscalera.setVisible(true);
        botonFull.setVisible(true);
        BotonPoker.setVisible(true);
        botonGrande.setVisible(true);
    }
   
    public void mostrarNumeroDados()//muestra el valor de los dados en los botones
    {
        botonDado1.setText(D1);//MUESRTA D1 en el boton dado1
        botonDado2.setText(D2);// muestra d2 en el boton dado2
        botonDado3.setText(D3);//muestra d3 en el boton dado3
        botonDado4.setText(D4);//muestra d4 en el boton dado4
        botonDado5.setText(D5);//muestra d5 en el boton dado5
    }

    private void bloquearNumDados(int volteo)//bloquea los numeros de los dados
    {
        if(volteo==2)
        {
        botonDado1.setEnabled(false);
        botonDado2.setEnabled(false);
        botonDado3.setEnabled(false);
        botonDado4.setEnabled(false);
        botonDado5.setEnabled(false);
        }
    }
    private void habilitarNumDados()
    {
        botonDado1.setEnabled(true);//habilita D1 en el boton dado1
        botonDado2.setEnabled(true);// habilita d2 en el boton dado2
        botonDado3.setEnabled(true);//habilita d3 en el boton dado3
        botonDado4.setEnabled(true);//habilita d4 en el boton dado4
        botonDado5.setEnabled(true);//habilita d5 en el boton dado5
    }
    
    public void TirarDadocondicionado()
    {
        if(estadoDado1 == 1)
        {
            miJuego.tirar(1);
        }
        if(estadoDado2 == 1)
        {
            miJuego.tirar(2);
        }
        if(estadoDado3 == 1)
        {
            miJuego.tirar(3);
        }
        if(estadoDado4 == 1)
        {
            miJuego.tirar(4);
        }
        if(estadoDado5 == 1)
        {
            miJuego.tirar(5);
        }
    }
    
    public Jugador cualquierJugador()//metodo que devuelece al un jugador dependiendo el turno
    {
        if((turno%2)==0)
        {
            return jug1;
            
        }
        else
        {
           if(controlTipo!=1)
           {return jug2;
           
           }
           else
           {return jugM;
           }
            
        }
    }

    private boolean acaboElJuego()//metodo que verifica si el juego debe seguir en base a los registros
    {                             //de los jugadores 
      if(controlTipo==1)
      {if(jug1.verificarRegistro()==true && jugM.verificarRegistro()==true )
        {
            return true;
        }
          else
         {
            return false;
         }
      }
      else
      {
        if(jug1.verificarRegistro()==true && jug2.verificarRegistro()==true )
        {
            return true;
        }
        else
        {
            return false;
        }
      }
        
    }

    private void mostrarResultados() 
    {   pergamino.setVisible(true);
        resultados.setVisible(true);
        int R1=Integer.parseInt(jug1.pidoPuntaje());
        int R2;
        if(controlTipo==1)
        {R2=Integer.parseInt(jugM.pidoPuntaje());
        }
        else
        {R2=Integer.parseInt(jug2.pidoPuntaje());
        }
        
        if(R1>R2)
        {
            ganador.setText("Gana el Jugador 1");
            ganador.setVisible(true);
        }
        else
        {  
            if(R2>R1)
            {
                ganador.setText("Gana el Jugador 2");
                ganador.setVisible(true);
            }
            else
            {
                ganador.setText("            Empate");
                ganador.setVisible(true);
            }
        }
        res1.setText("Jugador1: "+jug1.pidoPuntaje());
        if(controlTipo==1)
        {res2.setText("Jugador2: "+jugM.pidoPuntaje());
        }
        else
        {res2.setText("Jugador2: "+jug2.pidoPuntaje());
        }
        
        res1.setVisible(true);
        res2.setVisible(true);
        SalirFin.setVisible(true);
        bloquearNumDados(2);
        bloquearJugadas();
        botonTirar.setEnabled(false);
        botonTerminar.setEnabled(false);
    }
    private void anularEtiquetasFinal()
    {
        pergamino.setVisible(false);
        SalirFin.setVisible(false);
        res1.setVisible(false);
        res2.setVisible(false);
        resultados.setVisible(false);
    }
        
    public void juegaBalas()
    {
        //metodo de accion del boton balas
        botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
        bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaBala.setText(miJ.getBalas());//llenas el tablero con balas
            jug1.llenarBalas(miJ.getBalas());
            jug1.cambiarRegistro(0);
        }
        else
        {
           if(controlTipo!=1)
           {etiquetaBala1.setText(miJ.getBalas());//llenas el tablero con balas
            jug2.llenarBalas(miJ.getBalas());
            jug2.cambiarRegistro(0);
           }
           else
           {etiquetaBala1.setText(miJ.getBalas());//llenas el tablero con balas
            jugM.llenarBalas(miJ.getBalas());
            jugM.cambiarRegistro(0);
           }
        }
    }
    public void juegaTontos()
    {  botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
        bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaTonto.setText(miJ.getTontos());//llenas el tablero con balas
            jug1.llenarTontos(miJ.getTontos());
            jug1.cambiarRegistro(1);
        }
        else
        {
            if(controlTipo!=1)
            {etiquetaTonto1.setText(miJ.getTontos());//llenas el tablero con balas
            jug2.llenarTontos(miJ.getTontos());
            jug2.cambiarRegistro(1);
            }
            else
            {etiquetaTonto1.setText(miJ.getTontos());//llenas el tablero con balas
             jugM.llenarTontos(miJ.getTontos());
             jugM.cambiarRegistro(1);
            }
        }
    }
    public void juegaTrenes()
    { botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
        bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaTrenes.setText(miJ.getTrenes());
            jug1.llenarTrenes(miJ.getTrenes());
            jug1.cambiarRegistro(2);
        }
        else
        {
            if(controlTipo!=1)
            {etiquetaTrenes1.setText(miJ.getTrenes());
             jug2.llenarTrenes(miJ.getTrenes());
             jug2.cambiarRegistro(2);
            }
            else
            {etiquetaTrenes1.setText(miJ.getTrenes());
             jugM.llenarTrenes(miJ.getTrenes());
             jugM.cambiarRegistro(2);
            }
        }
    }
    public void juegaCuadras()
    {botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaCuadra.setText(miJ.getCuadras());
            jug1.llenarCuadras(miJ.getCuadras());
            jug1.cambiarRegistro(3);
        }
        else
        {
            if(controlTipo!=1)
            {etiquetaCuadra1.setText(miJ.getCuadras());
             jug2.llenarCuadras(miJ.getCuadras());
             jug2.cambiarRegistro(3);
            }
            else
            {etiquetaCuadra1.setText(miJ.getCuadras());
             jugM.llenarCuadras(miJ.getCuadras());
             jugM.cambiarRegistro(3);
            }
           
        }
    }
    public void juegaQuinas()
    { botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaQuina.setText(miJ.getQuinas());
            jug1.llenarQuinas(miJ.getQuinas());
            jug1.cambiarRegistro(4);
        }
        else
        {
            if(controlTipo!=1)
            {etiquetaQuina1.setText(miJ.getQuinas());
             jug2.llenarQuinas(miJ.getQuinas());
             jug2.cambiarRegistro(4);
            }
            else
            {etiquetaQuina1.setText(miJ.getQuinas());
             jugM.llenarQuinas(miJ.getQuinas());
             jugM.cambiarRegistro(4);
            }
        }
    }
    public void juegaCenas()
    { botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
            etiquetaCenas.setText(miJ.getCenas());
            jug1.llenarCenas(miJ.getCenas());
            jug1.cambiarRegistro(5);
        }
        else
        {
            if(controlTipo!=1)
            {etiquetaCenas1.setText(miJ.getCenas());
             jug2.llenarCenas(miJ.getCenas());
             jug2.cambiarRegistro(5);
            }
            else
            {
             etiquetaCenas1.setText(miJ.getCenas());
             jugM.llenarCenas(miJ.getCenas());
             jugM.cambiarRegistro(5);
            }
        }    
    }
    public void juegaEscalera()
    {  botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
          if(!botonEscalera.getText().equals("AnularEsc"))
          {if(mano==1)
               {
                    etiquetaEscalera.setText("25");
                    jug1.llenarEscalera2(mano);
               }
               if(mano==2)
               {
                    etiquetaEscalera.setText("20");
                    jug1.llenarEscalera2(mano);
               }
               jug1.cambiarRegistro(6);
          }
          else
          {
           etiquetaEscalera.setText("0");
           jug1.tabla[6]=0;
           jug1.cambiarRegistro(6);
          }

        }
        else
        {
           if(controlTipo!=1)
           {if(!botonEscalera.getText().equals("AnularEsc"))
             {if(mano==1)
               {
                    etiquetaEscalera1.setText("25");
                    jug2.llenarEscalera2(mano);
               }
               if(mano==2)
               {
                    etiquetaEscalera1.setText("20");
                    jug2.llenarEscalera2(mano);
               }
               jug2.cambiarRegistro(6);
             }
             else
             {
              etiquetaEscalera1.setText("0");
              jug2.tabla[6]=0;
              jug2.cambiarRegistro(6);
             }
           }
           else
           {if(!botonEscalera.getText().equals("AnularEsc"))
             {etiquetaEscalera1.setText("25");
              jugM.llenarEscalera();
              jugM.cambiarRegistro(6);
             }
             else
             {
              etiquetaEscalera1.setText("0");
              jugM.tabla[6]=0;
              jugM.cambiarRegistro(6);
             }
           }
        }
    }
    public void juegaFull()
    {botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
           if(!botonFull.getText().equals("AnularFull"))
          {if(mano==1)
              {
              etiquetaFull.setText("35");
              jug1.llenarFull2(mano);
              }
            if(mano==2)
              {
              etiquetaFull.setText("30");
              jug1.llenarFull2(mano);
              }
            jug1.cambiarRegistro(7);
          }
          else
          {
           etiquetaFull.setText("0");
           jug1.tabla[7]=0;
           jug1.cambiarRegistro(7);
          }

        }
        else
        {
          if(controlTipo!=1)
          {if(!botonFull.getText().equals("AnularFull"))
           {if(mano==1)
               {
                    etiquetaFull1.setText("35");
                    jug2.llenarFull2(mano);
               }
               if(mano==2)
               {
                    etiquetaFull1.setText("30");
                    jug2.llenarFull2(mano);
               }
               jug2.cambiarRegistro(7);
           }
           else
           {
             etiquetaFull1.setText("0");
             jug2.tabla[7]=0;
             jug2.cambiarRegistro(7);
           }
          }
          else
          {if(!botonFull.getText().equals("AnularFull"))
            { etiquetaFull1.setText("35");
             jugM.llenarFull();
             jugM.cambiarRegistro(7);
            }
            else
            {
              etiquetaFull1.setText("0");
              jugM.tabla[7]=0;
              jugM.cambiarRegistro(7);
            }
          }
        }
    }
    public void juegaPoker()
    { botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
          if(!BotonPoker.getText().equals("AnularPok"))
          {if(mano==1)
              {
              etiquetaPoker.setText("45");
              jug1.llenarPoker2(mano);
              }
              if(mano==2)
              {
              etiquetaPoker.setText("40");
              jug1.llenarPoker2(mano);
              }
              jug1.cambiarRegistro(8);
          }
          else
          {
           etiquetaPoker.setText("0");
           jug1.tabla[8]=0;
           jug1.cambiarRegistro(8);
          }

        }
        else
        {
           if(controlTipo!=1)
           {if(!BotonPoker.getText().equals("AnularPok"))
            {if(mano==1)
              {
              etiquetaPoker1.setText("45");
              jug2.llenarPoker2(mano);
              }
              if(mano==2)
              {
              etiquetaPoker1.setText("40");
              jug2.llenarPoker2(mano);
              }
              jug2.cambiarRegistro(8);
            }
            else
            {
              etiquetaPoker1.setText("0");
              jug2.tabla[8]=0;
              jug2.cambiarRegistro(8);
            }
           }
           else
           {if(!BotonPoker.getText().equals("AnularPok"))
            {etiquetaPoker1.setText("45");
             jugM.llenarPoker();
             jugM.cambiarRegistro(8);
            }
            else
            {
              etiquetaPoker1.setText("0");
              jugM.tabla[8]=0;
              jugM.cambiarRegistro(8);
            }
           }
        }
    }
    public void juegaGrande()
    {
        botonTirar.setVisible(false);//si se acciona el boton tirar se hace invisible
        botonTerminar.setVisible(true);
         bloquearJugadas();
        if((turno%2)==0)
        {
            if(botonGrande.getText().equals("AnularGR"))
            { if(jug1.registro[9]==false)
               {etiquetaGrande1.setText("0");
                jug1.tabla[9]=0;
                jug1.registro[9]=true;
               }
               else
               {etiquetaGrande2.setText("0");
                jug1.tabla[10]=0;
                jug1.registro[10]=true;
               }
            }
            else
            {if(etiquetaGrande1.getText().equals("50"))
             {
                etiquetaGrande2.setText("50");
                jug1.llenarGrande(2);
                jug1.registro[10]=true;
             }
             else
             {  etiquetaGrande2.setText("50");//modificar a etiquetaGrande1
                jug1.llenarGrande(2);
                jug1.registro[9]=true;
             }
            
            }
        }
        else
        {
            if(controlTipo!=1)
            {if(botonGrande.getText().equals("AnularGR"))
             { if(jug2.registro[9]==false)
               {etiquetaGrande3.setText("0");
                jug2.tabla[9]=0;
                jug2.registro[9]=true;
               }
               else
               {etiquetaGrande4.setText("0");
                jug2.tabla[10]=0;
                jug2.registro[10]=true;
               }
             }
             else
             {if(etiquetaGrande3.getText().equals("50"))
              {
                etiquetaGrande4.setText("50");
                jug2.llenarGrande(2);
                jug2.registro[10]=true;
              }
              else
              {  etiquetaGrande4.setText("50");//modificar a etiquetaGrande3
                jug2.llenarGrande(2);
                jug2.registro[9]=true;
              }
            
             }
           }
            else
            {if(botonGrande.getText().equals("AnularGR"))
             { if(jugM.registro[9]==false)
               {etiquetaGrande3.setText("0");
                jugM.tabla[9]=0;
                jugM.registro[9]=true;
               }
               else
               {etiquetaGrande4.setText("0");
                jugM.tabla[10]=0;
                jugM.registro[10]=true;
               }
             }
             else
             {if(etiquetaGrande3.getText().equals("50"))
              {
                etiquetaGrande4.setText("50");
                jugM.llenarGrande(2);
                jugM.registro[10]=true;
              }
              else
              {  etiquetaGrande4.setText("50");
                jugM.llenarGrande(2);
                jugM.registro[9]=true;
              }
            
             }
            }
        }
    }
    public void lanzamientoDosJugadores()
    {//metodo de acciones al presionar el boton tirar dado  
        if(mano==0)
        {
            habilitarNumDados();
            miJuego.tirarDado();//todos los dados se lanzan
            miJ = new Jugadas(miJuego.devolverTodos());//declaramos un objeto tipo jugadas y enviamos los dados para analizarlos
            D1=miJuego.devolverDado1();//devuelve el numero que salio en el dado 1 en tipo String
            D2=miJuego.devolverDado2();//devuelve el numero que salio en el dado 2 en tipo String
            D3=miJuego.devolverDado3();//devuelve el numero que salio en el dado 3 en tipo String
            D4=miJuego.devolverDado4();//devuelve el numero que salio en el dado 4 en tipo String
            D5=miJuego.devolverDado5();//devuelve el numero que salio en el dado 5 en tipo String
        
            mostrarNumeroDados();
        
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            
            HabilitarJugadas();
            mostrarJugadas();
            
            //bloquearJugadas();
            botonTirar.setEnabled(false);
        }
        if(mano==1)
        {
            TirarDadocondicionado();
            habilitarNumDados();
            
            D1=miJuego.devolverDado1();//devuelve el numero que salio en el dado 1 en tipo String
            D2=miJuego.devolverDado2();//devuelve el numero que salio en el dado 2 en tipo String
            D3=miJuego.devolverDado3();//devuelve el numero que salio en el dado 3 en tipo String
            D4=miJuego.devolverDado4();//devuelve el numero que salio en el dado 4 en tipo String
            D5=miJuego.devolverDado5();//devuelve el numero que salio en el dado 5 en tipo String
        
            mostrarNumeroDados();
        
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
        }
        mano++;
        bloquearTiro(mano);
        //InstruccionDeJugadas.setVisible(true);
        jug1.pidoPuntaje();//invocamos al metodo pidoPuntaje del jugador 1
    }

    private void lanzamientoUnJugador()
    {
       if(turno%2==0)
       {if(mano==0)
        {
            habilitarNumDados();
            miJuego.tirarDado();//todos los dados se lanzan
            miJ = new Jugadas(miJuego.devolverTodos());//declaramos un objeto tipo jugadas y enviamos los dados para analizarlos
            D1=miJuego.devolverDado1();//devuelve el numero que salio en el dado 1 en tipo String
            D2=miJuego.devolverDado2();//devuelve el numero que salio en el dado 2 en tipo String
            D3=miJuego.devolverDado3();//devuelve el numero que salio en el dado 3 en tipo String
            D4=miJuego.devolverDado4();//devuelve el numero que salio en el dado 4 en tipo String
            D5=miJuego.devolverDado5();//devuelve el numero que salio en el dado 5 en tipo String
        
            mostrarNumeroDados();
        
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
            
            HabilitarJugadas();
            mostrarJugadas();
            
            //bloquearJugadas();
            botonTirar.setEnabled(false);
        }
        if(mano==1)
        {
            TirarDadocondicionado();
            habilitarNumDados();
            
            D1=miJuego.devolverDado1();//devuelve el numero que salio en el dado 1 en tipo String
            D2=miJuego.devolverDado2();//devuelve el numero que salio en el dado 2 en tipo String
            D3=miJuego.devolverDado3();//devuelve el numero que salio en el dado 3 en tipo String
            D4=miJuego.devolverDado4();//devuelve el numero que salio en el dado 4 en tipo String
            D5=miJuego.devolverDado5();//devuelve el numero que salio en el dado 5 en tipo String
        
            mostrarNumeroDados();
        
            mostrarDados( D1,D2,D3,D4,D5 );//mandamos los dados String al metodo mostrar Dados
        }
        mano++;
        bloquearTiro(mano);
        //InstruccionDeJugadas.setVisible(true);
        jug1.pidoPuntaje();//invocamos al metodo pidoPuntaje del jugador 1
       }
        
    }

    private void terminarParaDosJugadores() 
    {
         if(acaboElJuego()==true)
        {
            mostrarResultados();
        }
        else
        {botonTirar.setEnabled(true);
         botonTirar.setVisible(true);
         botonTerminar.setVisible(false);
         //Instruccion.setVisible(false);
         if((turno%2)==0)
         {
            lblPuntaje.setText(jug1.pidoPuntaje());
         }
         else
         {
            if(controlTipo==1)
            {lblPuntaje1.setText(jugM.pidoPuntaje());}
            else
            {lblPuntaje1.setText(jug2.pidoPuntaje());
            }
         }
         //etiquetaToca(turno);
         turno++;
         getTurno(turno);
         bloquearNumDados(2);
         volteo=0;
         mano=0;
         estadoDado1=0;
         estadoDado2=0;
         estadoDado3=0;
         estadoDado4=0;
         estadoDado5=0;
        }
    }

    private void maquinaJuega(int R) 
    {
      int respuesta=R;
      switch(respuesta)
      {case 0: juegaBalas();
               break;
       case 1: juegaTontos();
               break;
       case 2: juegaTrenes();
               break;
       case 3: juegaCuadras();
               break;
       case 4: juegaQuinas();
               break;
       case 5: juegaCenas();
               break;
       case 6: juegaEscalera();
               break;
       case 7: juegaFull();
               break;
       case 8: juegaPoker();
               break;
       case 9: juegaGrande();
               break;
       case 10: juegaBalas();
               break;       
       case 11: juegaTontos();
               break;
       case 12: juegaTrenes();
               break;
       case 13: juegaCuadras();
               break;
       case 14: juegaQuinas();
               break;
       case 15: juegaCenas();
               break;
       case 16: juegaEscalera();
               break;
       case 17: juegaFull();
               break;
       case 18: juegaPoker();
               break;
       case 19: juegaGrande();
               break;
       
      }
    }

    
}
