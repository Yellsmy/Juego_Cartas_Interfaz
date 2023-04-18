package InterfazJuego;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juegocartas.Carta;
import juegocartas.Juego;
import juegocartas.Jugador;
import juegocartas.RegistroJugadores;

public class InterfazJuego extends javax.swing.JFrame {
  
    public InterfazJuego() {
        initComponents();
        
        //ponemos la tapa inicial
        Metodos.mostrarImagen(this.lblCarta, TAPA);

        //añadimos los botones al grupo
        buttonGroup1.add(this.mrdbBarTipoMazo1);
        buttonGroup1.add(this.mrdbBarTipoMazo2);
        
        // Desactivamos boton para iniciar juego
        this.jButtonIniciarJuego.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lblCarta = new javax.swing.JLabel();
        btnTomarCarta = new javax.swing.JButton();
        btnPasarTurno = new javax.swing.JButton();
        txtPuntosCarta = new javax.swing.JTextField();
        txtPuntosAcumulados = new javax.swing.JTextField();
        jLabelPuntosCarta = new javax.swing.JLabel();
        jLabelPuntosAcumulados = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadJugadores = new javax.swing.JTextField();
        jButtonIniciarJuego = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPuntosAcumulados1 = new javax.swing.JLabel();
        txtPuntosj1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelPuntosAcumulados2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPuntosAcumulados3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelPuntosAcumulados4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPuntosAcumulados5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPuntosAcumulados6 = new javax.swing.JLabel();
        txtPuntosj2 = new javax.swing.JTextField();
        txtPuntosj3 = new javax.swing.JTextField();
        txtPuntosj4 = new javax.swing.JTextField();
        txtPuntosj5 = new javax.swing.JTextField();
        txtPuntosj6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelPuntosAcumulados7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelPuntosAcumulados8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelPuntosAcumulados9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelPuntosAcumulados10 = new javax.swing.JLabel();
        txtPuntosj7 = new javax.swing.JTextField();
        txtPuntosj8 = new javax.swing.JTextField();
        txtPuntosj9 = new javax.swing.JTextField();
        txtPuntosj10 = new javax.swing.JTextField();
        txtNjugador = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mrdbBarTipoMazo1 = new javax.swing.JRadioButtonMenuItem();
        mrdbBarTipoMazo2 = new javax.swing.JRadioButtonMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jugador ");

        btnTomarCarta.setText("Tomar Carta");
        btnTomarCarta.setEnabled(false);
        btnTomarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarCartaActionPerformed(evt);
            }
        });

        btnPasarTurno.setText("Pasar Turno");
        btnPasarTurno.setEnabled(false);
        btnPasarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarTurnoActionPerformed(evt);
            }
        });

        txtPuntosCarta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPuntosCarta.setText("0");
        txtPuntosCarta.setEnabled(false);

        txtPuntosAcumulados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPuntosAcumulados.setText("0");
        txtPuntosAcumulados.setEnabled(false);

        jLabelPuntosCarta.setText("Puntos Carta");

        jLabelPuntosAcumulados.setText("Puntos Acumulados");

        jLabel2.setText("Cantidad de Jugadores");

        jButtonIniciarJuego.setText("Iniciar Juego");
        jButtonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarJuegoActionPerformed(evt);
            }
        });

        jLabel3.setText("Jugador 1");

        jLabelPuntosAcumulados1.setText("Puntos Acumulados");

        txtPuntosj1.setEditable(false);

        jLabel4.setText("Jugador 2");

        jLabelPuntosAcumulados2.setText("Puntos Acumulados");

        jLabel5.setText("Jugador 3");

        jLabelPuntosAcumulados3.setText("Puntos Acumulados");

        jLabel6.setText("Jugador 4");

        jLabelPuntosAcumulados4.setText("Puntos Acumulados");

        jLabel7.setText("Jugador 5");

        jLabelPuntosAcumulados5.setText("Puntos Acumulados");

        jLabel8.setText("Jugador 6");

        jLabelPuntosAcumulados6.setText("Puntos Acumulados");

        txtPuntosj2.setEditable(false);

        txtPuntosj3.setEditable(false);

        txtPuntosj4.setEditable(false);

        txtPuntosj5.setEditable(false);

        txtPuntosj6.setEditable(false);

        jLabel9.setText("Jugador 7");

        jLabelPuntosAcumulados7.setText("Puntos Acumulados");

        jLabel10.setText("Jugador 8");

        jLabelPuntosAcumulados8.setText("Puntos Acumulados");

        jLabel11.setText("Jugador 9");

        jLabelPuntosAcumulados9.setText("Puntos Acumulados");

        jLabel12.setText("Jugador 10");

        jLabelPuntosAcumulados10.setText("Puntos Acumulados");

        txtPuntosj7.setEditable(false);
        txtPuntosj7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntosj7ActionPerformed(evt);
            }
        });

        txtPuntosj8.setEditable(false);

        txtPuntosj9.setEditable(false);

        txtPuntosj10.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados10)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados9)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados8)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados7)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj7))
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj6))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPuntosAcumulados2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntosj2)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados1)
                    .addComponent(txtPuntosj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados2)
                    .addComponent(txtPuntosj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados3)
                    .addComponent(txtPuntosj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados4)
                    .addComponent(txtPuntosj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPuntosAcumulados5)
                    .addComponent(txtPuntosj5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados6)
                    .addComponent(txtPuntosj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados7)
                    .addComponent(txtPuntosj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados8)
                    .addComponent(txtPuntosj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados9)
                    .addComponent(txtPuntosj9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPuntosAcumulados10)
                    .addComponent(txtPuntosj10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtNjugador.setEditable(false);
        txtNjugador.setEnabled(false);

        jMenu1.setText("Baraja");

        jMenu3.setText("Tipo de Juego");

        mrdbBarTipoMazo1.setText("10 y medio");
        mrdbBarTipoMazo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarTipoMazo1ActionPerformed(evt);
            }
        });
        jMenu3.add(mrdbBarTipoMazo1);

        mrdbBarTipoMazo2.setText("7 y medio");
        mrdbBarTipoMazo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarTipoMazo2ActionPerformed(evt);
            }
        });
        jMenu3.add(mrdbBarTipoMazo2);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonIniciarJuego)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelPuntosAcumulados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPuntosAcumulados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnPasarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTomarCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelPuntosCarta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPuntosCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNjugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnTomarCarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPasarTurno)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPuntosCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPuntosCarta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPuntosAcumulados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPuntosAcumulados))
                        .addGap(158, 158, 158)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidadJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIniciarJuego))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mrdbBarTipoMazo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarTipoMazo1ActionPerformed

        MAZO=1;
        juego.llenarMazo(MAZO);
        juego.barajear(MAZO);
        this.jButtonIniciarJuego.setEnabled(true);
    }//GEN-LAST:event_mrdbBarTipoMazo1ActionPerformed

    private void primerJugador(){
        if(JUGADOR == juego.listaJugadores.getRegistroJugadores().size()){
            this.txtNjugador.setText("1");
            Metodos.mostrarImagen(this.lblCarta, TAPA);
            this.txtPuntosAcumulados.setText(0+"");
            this.txtPuntosCarta.setText(0+"");
        }else{
            this.txtNjugador.setText(JUGADOR+1+"");
            Metodos.mostrarImagen(this.lblCarta, TAPA);
            this.txtPuntosAcumulados.setText(0+"");
            this.txtPuntosCarta.setText(0+"");
        }
        
    }
    private void mrdbBarTipoMazo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarTipoMazo2ActionPerformed

        MAZO = 2;
        juego.llenarMazo(MAZO);
        juego.barajear(MAZO);
        this.jButtonIniciarJuego.setEnabled(true);
    }//GEN-LAST:event_mrdbBarTipoMazo2ActionPerformed

    private void iniciarJuego(int jugador){
        Metodos.mostrarImagen(this.lblCarta, DIR_IMG+"\\tipoMazo1\\"+juego.getMazoBarajeado().get(0).getPalo().toString().toLowerCase()+ "\\"+juego.getMazoBarajeado().get(0).getIdentificadorCarta()+".jpg");
        String carta = juego.repartirCarta();
        double puntosCarta= juego.valorCartaRepartida(carta,MAZO); 
        Jugador jugadorX = new Jugador(jugador,puntosCarta );
        juego.listaJugadores.addJugadoresRegistro(jugadorX);
        double totalPuntos = juego.listaJugadores.getRegistroJugadores().get(jugador-1).getPuntos();
        this.txtPuntosCarta.setText((puntosCarta+""));
        this.txtPuntosAcumulados.setText(totalPuntos+"");
    }
    
    public void desactivarBotones(){
        this.btnPasarTurno.setEnabled(false);
        this.btnTomarCarta.setEnabled(false);
    }
    
    private void mostrarTxt(int jugador){
        String puntosAcumulados = juego.listaJugadores.getRegistroJugadores().get(jugador-1).getPuntos()+"";
        if(jugador == 1){
            this.txtPuntosj1.setText(puntosAcumulados);
        }
        else if(jugador == 2){
            this.txtPuntosj2.setText(puntosAcumulados);
        }
        else if(jugador == 3){
            this.txtPuntosj3.setText(puntosAcumulados);
        }
        else if(jugador == 4){
            this.txtPuntosj4.setText(puntosAcumulados);
        }
        else if(jugador == 5){
            this.txtPuntosj5.setText(puntosAcumulados);
        }
        else if(jugador == 6){
            this.txtPuntosj6.setText(puntosAcumulados);
        }
        else if(jugador == 7){
            this.txtPuntosj7.setText(puntosAcumulados);
        }
        else if(jugador == 8){
            this.txtPuntosj8.setText(puntosAcumulados);
        }
        else if(jugador == 9){
            this.txtPuntosj9.setText(puntosAcumulados);
        }
        else if(jugador == 10){
            this.txtPuntosj10.setText(puntosAcumulados);
        }
    }
    private void btnTomarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarCartaActionPerformed
        primerJugador();
        Metodos.mostrarImagen(this.lblCarta, DIR_IMG+"\\tipoMazo1\\"+juego.getMazoBarajeado().get(0).getPalo().toString().toLowerCase()+ "\\"+juego.getMazoBarajeado().get(0).getIdentificadorCarta()+".jpg");
        String carta = juego.repartirCarta();
        double puntosCarta= juego.valorCartaRepartida(carta,1);
        juego.agregarCartaJugador(JUGADOR, puntosCarta);
        double puntos = juego.listaJugadores.getRegistroJugadores().get(JUGADOR-1).getPuntos();
        mostrarTxt(JUGADOR);
        this.txtPuntosCarta.setText((puntosCarta+""));
        this.txtPuntosAcumulados.setText(puntos+"");
        
        Metodos.ganar(juego, puntos, MAZO,JUGADOR, this, juego.listaJugadores);
        JUGADOR+=1;  
        if(JUGADOR > juego.indiceJugador.length){
            JUGADOR =1;
        }
    }//GEN-LAST:event_btnTomarCartaActionPerformed

    private void btnPasarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarTurnoActionPerformed
        
        primerJugador();
        this.txtPuntosj10.setText(JUGADOR+"");
        this.txtPuntosj9.setText(CONTADOR+"");
        if(CONTADOR == juego.listaJugadores.getRegistroJugadores().size()){
            this.txtPuntosj8.setText(juego.listaJugadores.getRegistroJugadores().size()+"");
            Jugador jugadorG = juego.ganador();
            
            
            //jugadorGanador.add(mensaje);
           // jugadorGanador.setVisible(true);
            desactivarBotones();
            JDialog dialog = new JDialog(this, "Ganador");
            JLabel mensaje = new JLabel("FELICIDADES JUGADOR "+JUGADOR+" HAS GANADO CON "+jugadorG.getPuntos()+" puntos");
            dialog.add(mensaje);
            dialog.setSize(500, 500);
            dialog.setVisible(true);
            
            //jugadorGanador.datosGanador(1, 10.5);
        }
        else{
            if( JUGADOR == CONTADOR){
                CONTADOR +=1;
                if(CONTADOR > juego.listaJugadores.getRegistroJugadores().size()){
                    CONTADOR =1;
                }
            }
            else if(CONTADOR != JUGADOR){
                CONTADOR =1; 
            }
        }
        JUGADOR+=1;  
        if(JUGADOR > juego.indiceJugador.length){
            JUGADOR =1;
        }
    }//GEN-LAST:event_btnPasarTurnoActionPerformed

    private void jButtonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarJuegoActionPerformed
        // TODO add your handling code here:
        JUGADORES = Integer.parseInt(txtCantidadJugadores.getText());
        this.txtPuntosj1.setText(JUGADORES+"");
        juego.jugadores(JUGADORES);
        for (int i =0; i< juego.indiceJugador.length; i++){
            JUGADOR = i;
            iniciarJuego(i+1);
            mostrarTxt(i+1);
        }
        JUGADOR =1;
        btnTomarCarta.setEnabled(true);
        btnPasarTurno.setEnabled(true);
        this.jButtonIniciarJuego.setEnabled(false);
        primerJugador();
        this.txtNjugador.setText(JUGADOR+"");
    }//GEN-LAST:event_jButtonIniciarJuegoActionPerformed

    private void txtPuntosj7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntosj7ActionPerformed
      
    }//GEN-LAST:event_txtPuntosj7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazJuego().setVisible(true);
            }
        });
    }

    //Atributos creados por mi
    private Juego juego = new Juego();
    //private int n = 1;
    //private String jLB = "jLabel"+n+"";
    
   
    //Constantes
    private final String DIR_IMG = "img";
    private final String TAPA = DIR_IMG+"\\otras\\tapa.jpg";
    int MAZO = 0;
    //private final RegistroJugadores LISTA_JUGADORES = new RegistroJugadores();
    int JUGADORES =0;
    int JUGADOR=0;
    int CONTADOR =1;
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPasarTurno;
    private javax.swing.JButton btnTomarCarta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonIniciarJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPuntosAcumulados;
    private javax.swing.JLabel jLabelPuntosAcumulados1;
    private javax.swing.JLabel jLabelPuntosAcumulados10;
    private javax.swing.JLabel jLabelPuntosAcumulados2;
    private javax.swing.JLabel jLabelPuntosAcumulados3;
    private javax.swing.JLabel jLabelPuntosAcumulados4;
    private javax.swing.JLabel jLabelPuntosAcumulados5;
    private javax.swing.JLabel jLabelPuntosAcumulados6;
    private javax.swing.JLabel jLabelPuntosAcumulados7;
    private javax.swing.JLabel jLabelPuntosAcumulados8;
    private javax.swing.JLabel jLabelPuntosAcumulados9;
    private javax.swing.JLabel jLabelPuntosCarta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCarta;
    private javax.swing.JRadioButtonMenuItem mrdbBarTipoMazo1;
    private javax.swing.JRadioButtonMenuItem mrdbBarTipoMazo2;
    private javax.swing.JTextField txtCantidadJugadores;
    private javax.swing.JTextField txtNjugador;
    private javax.swing.JTextField txtPuntosAcumulados;
    private javax.swing.JTextField txtPuntosCarta;
    private javax.swing.JTextField txtPuntosj1;
    private javax.swing.JTextField txtPuntosj10;
    private javax.swing.JTextField txtPuntosj2;
    private javax.swing.JTextField txtPuntosj3;
    private javax.swing.JTextField txtPuntosj4;
    private javax.swing.JTextField txtPuntosj5;
    private javax.swing.JTextField txtPuntosj6;
    private javax.swing.JTextField txtPuntosj7;
    private javax.swing.JTextField txtPuntosj8;
    private javax.swing.JTextField txtPuntosj9;
    // End of variables declaration//GEN-END:variables
}
