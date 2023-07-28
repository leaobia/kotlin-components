package br.senai.sp.jandira.login.logincomponent.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.login.logincomponent.components.Form
import br.senai.sp.jandira.login.logincomponent.components.Header

@Composable
fun LoginScreen() {
    Column {
        Header()

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    Column {
        LoginScreen()
        Form()
    }

}