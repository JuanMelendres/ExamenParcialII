# ExamenParcialII

## EQUIPO 5

1. Crea 4 diferentes fragmentos. Cada miembro del equipo tendrá su propio fragmento en donde pondrán su foto y existirá un último fragmento que contendrá solamente un recycler view. La actividad principal tendrá 2 botones arriba, un contenedor para fragmentos y 2 botones abajo. Al iniciar la actividad se cargará programáticamente el fragmento que contiene el recycler view.

2. Agrega lógica a tu actividad principal para utilizar los 4 botones - cada botón mostrará uno de los 4 diferentes fragmentos. Asegúrate que al mostrar un nuevo fragmento remueva el fragmento anterior.

3. Obtén en línea por medio de un request HTTP datos contenidos en un flujo JSON. Asegúrate que el objeto raíz del JSON sea de tipo objeto y que contenga la información individual por renglón que deberá ser presentada (nombre del perrito, peso). Esto sucederá al presionar un botón que pondrás en el fragmento que contiene en recycler view.

4. Cada renglón de la recycler view tendrá 2 botones, además de mostrar el nombre y peso del perrito en cuestión. Al presionar el primer botón se mostrará el mensaje “PERRITO” + nombre del perrito en un toast. Al presionar el segundo botón se mostrará “PESO” + el peso del perrito en otro toast.

5. Crea un adaptador para utilizar en la recycler view que sea capaz de interpretar el JSONObject obtenido del request y lo traslade correctamente a interfaz gráfica.
