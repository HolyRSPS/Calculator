class Calculator : javax.swing.JFrame() {

    //variables
    internal var firstnum: Double = 0.toDouble()
    internal var secondnum: Double = 0.toDouble()
    internal var result: Double = 0.toDouble()
    internal lateinit var operations: String

    // Variables declaration - do not modify
    private var jButton1: javax.swing.JButton? = null
    private var jButton10: javax.swing.JButton? = null
    private var jButton11: javax.swing.JButton? = null
    private var jButton12: javax.swing.JButton? = null
    private var jButton13: javax.swing.JButton? = null
    private var jButton14: javax.swing.JButton? = null
    private var jButton15: javax.swing.JButton? = null
    private var jButton16: javax.swing.JButton? = null
    private var jButton17: javax.swing.JButton? = null
    private var jButton2: javax.swing.JButton? = null
    private var jButton3: javax.swing.JButton? = null
    private var jButton4: javax.swing.JButton? = null
    private var jButton5: javax.swing.JButton? = null
    private var jButton6: javax.swing.JButton? = null
    private var jButton7: javax.swing.JButton? = null
    private var jButton8: javax.swing.JButton? = null
    private var jToggleButton1: javax.swing.JToggleButton? = null
    private var jtxtDisplay: javax.swing.JTextField? = null

    init {
        initComponents()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private// <editor-fold defaultstate="collapsed" desc="Generated Code">
    fun initComponents() {

        jToggleButton1 = javax.swing.JToggleButton()
        jtxtDisplay = javax.swing.JTextField()
        jButton1 = javax.swing.JButton()
        jButton2 = javax.swing.JButton()
        jButton3 = javax.swing.JButton()
        jButton4 = javax.swing.JButton()
        jButton5 = javax.swing.JButton()
        jButton6 = javax.swing.JButton()
        jButton7 = javax.swing.JButton()
        jButton8 = javax.swing.JButton()
        jButton10 = javax.swing.JButton()
        jButton11 = javax.swing.JButton()
        jButton13 = javax.swing.JButton()
        jButton14 = javax.swing.JButton()
        jButton16 = javax.swing.JButton()
        jButton15 = javax.swing.JButton()
        jButton17 = javax.swing.JButton()
        jButton12 = javax.swing.JButton()

        jToggleButton1!!.text = "jToggleButton1"

        defaultCloseOperation = javax.swing.WindowConstants.EXIT_ON_CLOSE

        jtxtDisplay!!.background = java.awt.Color(255, 255, 255)
        jtxtDisplay!!.horizontalAlignment = javax.swing.JTextField.RIGHT
        jtxtDisplay!!.addActionListener { evt -> jtxtDisplayActionPerformed(evt) }

        jButton1!!.background = java.awt.Color(96, 96, 96)
        jButton1!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton1!!.text = "7"
        jButton1!!.addActionListener { evt -> jButton1ActionPerformed(evt) }

        jButton2!!.background = java.awt.Color(96, 96, 96)
        jButton2!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton2!!.text = "4"
        jButton2!!.addActionListener { evt -> jButton2ActionPerformed(evt) }

        jButton3!!.background = java.awt.Color(96, 96, 96)
        jButton3!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton3!!.text = "."
        jButton3!!.addActionListener { evt -> jButton3ActionPerformed(evt) }

        jButton4!!.background = java.awt.Color(96, 96, 96)
        jButton4!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton4!!.text = "8"
        jButton4!!.addActionListener { evt -> jButton4ActionPerformed(evt) }

        jButton5!!.background = java.awt.Color(96, 96, 96)
        jButton5!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton5!!.text = "5"
        jButton5!!.addActionListener { evt -> jButton5ActionPerformed(evt) }

        jButton6!!.background = java.awt.Color(96, 96, 96)
        jButton6!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton6!!.text = "0"
        jButton6!!.addActionListener { evt -> jButton6ActionPerformed(evt) }

        jButton7!!.background = java.awt.Color(96, 96, 96)
        jButton7!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton7!!.text = "1"
        jButton7!!.addActionListener { evt -> jButton7ActionPerformed(evt) }

        jButton8!!.background = java.awt.Color(96, 96, 96)
        jButton8!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton8!!.text = "2"
        jButton8!!.addActionListener { evt -> jButton8ActionPerformed(evt) }

        jButton10!!.background = java.awt.Color(96, 96, 96)
        jButton10!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton10!!.text = "9"
        jButton10!!.addActionListener { evt -> jButton10ActionPerformed(evt) }

        jButton11!!.background = java.awt.Color(96, 96, 96)
        jButton11!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton11!!.text = "6"
        jButton11!!.addActionListener { evt -> jButton11ActionPerformed(evt) }

        jButton13!!.background = java.awt.Color(96, 96, 96)
        jButton13!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton13!!.text = "/"
        jButton13!!.addActionListener { evt -> jButton13ActionPerformed(evt) }

        jButton14!!.background = java.awt.Color(96, 96, 96)
        jButton14!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton14!!.text = "*"
        jButton14!!.addActionListener { evt -> jButton14ActionPerformed(evt) }

        jButton16!!.background = java.awt.Color(96, 96, 96)
        jButton16!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton16!!.text = "3"
        jButton16!!.addActionListener { evt -> jButton16ActionPerformed(evt) }

        jButton15!!.background = java.awt.Color(96, 96, 96)
        jButton15!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton15!!.text = "-"
        jButton15!!.addActionListener { evt -> jButton15ActionPerformed(evt) }

        jButton17!!.background = java.awt.Color(96, 96, 96)
        jButton17!!.font = java.awt.Font("Monospaced", 2, 18) // NOI18N
        jButton17!!.text = "+"
        jButton17!!.addActionListener { evt -> jButton17ActionPerformed(evt) }

        jButton12!!.background = java.awt.Color(96, 96, 96)
        jButton12!!.font = java.awt.Font("Tahoma", 3, 24) // NOI18N
        jButton12!!.text = "="
        jButton12!!.addActionListener { evt -> jButton12ActionPerformed(evt) }

        val layout = javax.swing.GroupLayout(contentPane)
        contentPane.layout = layout
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtDisplay)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(82, 82, 82)
                                                                                .addComponent(jButton8!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jButton6!!, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton16!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, java.lang.Short.MAX_VALUE.toInt())))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jButton4!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton10!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton13!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jButton5!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton11!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton15!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton14!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton17!!, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(164, 164, 164)
                                                                .addComponent(jButton12!!, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(23, 23, 23))))
        )
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtxtDisplay!!, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton13!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton14!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton17!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton7!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton8!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton16!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton6!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3!!, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton12!!, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(67, java.lang.Short.MAX_VALUE.toInt()))
        )

        pack()
    }// </editor-fold>

    private fun jButton15ActionPerformed(evt: java.awt.event.ActionEvent) {
        firstnum = java.lang.Double.parseDouble(jtxtDisplay!!.text)
        jtxtDisplay!!.text = ""
        operations = "-"
    }

    private fun jButton7ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton7!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton1!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton4ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton4!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton10ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton10!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton2ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton2!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton5ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton5!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton11ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton11!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton8ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton8!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton16ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton16!!.text
        jtxtDisplay!!.text = Enternumber
    }
    //arithemetic operations

    private fun jButton17ActionPerformed(evt: java.awt.event.ActionEvent) {
        firstnum = java.lang.Double.parseDouble(jtxtDisplay!!.text)
        jtxtDisplay!!.text = ""
        operations = "+"
    }

    private fun jButton14ActionPerformed(evt: java.awt.event.ActionEvent) {
        firstnum = java.lang.Double.parseDouble(jtxtDisplay!!.text)
        jtxtDisplay!!.text = ""
        operations = "*"
    }

    private fun jButton13ActionPerformed(evt: java.awt.event.ActionEvent) {
        firstnum = java.lang.Double.parseDouble(jtxtDisplay!!.text)
        jtxtDisplay!!.text = ""
        operations = "/"
    }

    private fun jButton3ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton3!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jButton6ActionPerformed(evt: java.awt.event.ActionEvent) {
        val Enternumber = jtxtDisplay!!.text + jButton6!!.text
        jtxtDisplay!!.text = Enternumber
    }

    private fun jtxtDisplayActionPerformed(evt: java.awt.event.ActionEvent) {

    }

    //  =
    private fun jButton12ActionPerformed(evt: java.awt.event.ActionEvent) {
        val answer: String
        secondnum = java.lang.Double.parseDouble(jtxtDisplay!!.text)
        if (operations === "+") {
            result = firstnum + secondnum
            answer = String.format("%.01f", result)
            jtxtDisplay!!.text = answer
        } else if (operations === "-") {
            result = firstnum - secondnum
            answer = String.format("%.01f", result)
            jtxtDisplay!!.text = answer
        } else if (operations === "*") {
            result = firstnum * secondnum
            answer = String.format("%.01f", result)
            jtxtDisplay!!.text = answer
        } else if (operations === "/") {
            result = firstnum / secondnum
            answer = String.format("%.01f", result)
            jtxtDisplay!!.text = answer
        }
    }

    companion object {

        /**
         * @param args the command line arguments
         */
        @JvmStatic
        fun main(args: Array<String>) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
            try {
                for (info in javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus" == info.name) {
                        javax.swing.UIManager.setLookAndFeel(info.className)
                        break
                    }
                }
            } catch (ex: ClassNotFoundException) {
                java.util.logging.Logger.getLogger(Calculator::class.java.name).log(java.util.logging.Level.SEVERE, null, ex)
            } catch (ex: InstantiationException) {
                java.util.logging.Logger.getLogger(Calculator::class.java.name).log(java.util.logging.Level.SEVERE, null, ex)
            } catch (ex: IllegalAccessException) {
                java.util.logging.Logger.getLogger(Calculator::class.java.name).log(java.util.logging.Level.SEVERE, null, ex)
            } catch (ex: javax.swing.UnsupportedLookAndFeelException) {
                java.util.logging.Logger.getLogger(Calculator::class.java.name).log(java.util.logging.Level.SEVERE, null, ex)
            }

            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater {
                Calculator().isVisible = true
                Calculator().title = "Calculator"
            }
        }
    }
    // End of variables declaration
}
