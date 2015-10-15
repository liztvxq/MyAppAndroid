package com.example.cristinalizeth.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by cristinalizeth on 09/10/2015.
 */
public class AgregarProducto extends ActionBarActivity {
    Button Add;
    String type;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_producto);

        Add = (Button)findViewById(R.id.button_Agregar);

        Bundle bundle = this.getIntent().getExtras();

        type= bundle.getString("type");

        if(type.equals("add")){
            Add.setText("Add Producto");

        }
    }
}
