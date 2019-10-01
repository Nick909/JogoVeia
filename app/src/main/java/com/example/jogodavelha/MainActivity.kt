package com.example.jogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val btnAtual = view as Button
        var idBtn = 0

        when(btnAtual.id) {
            R.id.btn1 -> idBtn = 1
            R.id.btn2 -> idBtn = 2
            R.id.btn3 -> idBtn = 3
            R.id.btn4 -> idBtn = 4
            R.id.btn5 -> idBtn = 5
            R.id.btn6 -> idBtn = 6
            R.id.btn7 -> idBtn = 7
            R.id.btn8 -> idBtn = 8
            R.id.btn9 -> idBtn = 9
        }

        //Toast.makeText( this,"ID: "+idBtn, Toast.LENGTH_SHORT ).show()
        playGame( idBtn, btnAtual )
    }

    var jogador1 = ArrayList<Int>()
    var jogador2 = ArrayList<Int>()

    var jogadorDaVez = 1

    fun playGame( idBtn: Int, btnAtual: Button ) {

        if( jogadorDaVez == 1 ) {
            btnAtual.text = "X"
            btnAtual.setBackgroundColor(Color.BLUE)
            btnAtual.setTextColor(Color.parseColor("#18FF00"))
            jogador1.add(idBtn)
            jogadorDaVez = 2
        }else if( jogadorDaVez == 2 ) {
            btnAtual.text = "O"
            btnAtual.setBackgroundColor(Color.parseColor("#B20CE8"))
            btnAtual.setTextColor(Color.parseColor("#FFFD00"))
            jogador2.add(idBtn)
            jogadorDaVez = 1
        }
        vencendor()
        btnAtual.isEnabled  = false
    }

    fun vencendor() {
        var campeao = -1

        //linha 1
        if(jogador1.contains(1) && jogador1.contains(2) && jogador1.contains(3)) {
            campeao = 1
        }

        if(jogador2.contains(1) && jogador2.contains(2) && jogador2.contains(3)) {
            campeao = 2
        }
if(jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)) {
            campeao = 1
        }

        if(jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)) {
            campeao = 2
        }
        //linha 2
        if(jogador1.contains(4) && jogador1.contains(5) && jogador1.contains(6)) {
            campeao = 1
        }

        if(jogador2.contains(4) && jogador2.contains(5) && jogador2.contains(6)) {
            campeao = 2
        }

        //linha 3
        if(jogador1.contains(7) && jogador1.contains(8) && jogador1.contains(9)) {
            campeao = 1
        }

        if(jogador2.contains(7) && jogador2.contains(8) && jogador2.contains(9)) {
            campeao = 2
        }

        ///////////////////////////////////////////////////////////////////////


        //coluna 1
        if(jogador1.contains(1) && jogador1.contains(4) && jogador1.contains(7)) {
            campeao = 1
        }

        if(jogador2.contains(1) && jogador2.contains(4) && jogador2.contains(7)) {
            campeao = 2
        }

        //coluna 2
        if(jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)) {
            campeao = 1
        }

        if(jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)) {
            campeao = 2
        }

        //coluna 3
        if(jogador1.contains(3) && jogador1.contains(6) && jogador1.contains(9)) {
            campeao = 1
        }

        if(jogador2.contains(3) && jogador2.contains(6) && jogador2.contains(9)) {
            campeao = 2
        }

        //////////////////////////////////////////////////////////////////////

        //diagonal1
        if(jogador1.contains(1) && jogador1.contains(5) && jogador1.contains(9)) {
            campeao = 1
        }

        if(jogador2.contains(1) && jogador2.contains(5) && jogador2.contains(9)) {
            campeao = 2
        }

        //diagonal2
        if(jogador1.contains(3) && jogador1.contains(5) && jogador1.contains(7)) {
            campeao = 1
        }

        if(jogador2.contains(3) && jogador2.contains(5) && jogador2.contains(7)) {
            campeao = 2
        }

        //campeao
        if(campeao !=  -10){
            if(campeao == 1) {
                Toast.makeText(this, "jogador1: ganhou o jogo", Toast.LENGTH_SHORT).show()
            }else if (campeao == 2) {
                Toast.makeText(this, "jogador2: ganhou o jogo", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

