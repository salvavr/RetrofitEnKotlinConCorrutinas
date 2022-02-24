package salva.pmdm.retrofitenkotlinconcorrutinas

import android.widget.ImageView
import com.squareup.picasso.Picasso

/*
Esta clase es muy sencilla, lo único que tiene es una función bind() que se llamará desde el
adapter y le pasará una url en formato String, una vez dentro usaremos la librería de Picasso
para cargar esa URL en nuestro iVDog.
 */
fun ImageView.fromUrl(url:String){
    Picasso.get().load(url).into(this)
}