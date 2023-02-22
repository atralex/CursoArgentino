window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    const usuarios = document.getElementById('usuarios');
    if (usuarios) {
        cargarUsuarios();
        new simpleDatatables.DataTable(usuarios);
    }
    async function cargarUsuarios(){
    fetch('usuarios')
      .then(response => response.json())
      .then(usuarios => console.log(usuarios));
      let usuario = '<tr><td>123</td><td>Alejandro</td><td>atraefef@gmail.com</td><td>614565656</td><td><a href="#" class="btn-danger btn btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'
      document.querySelector('#usuarios tbody').outerHTML = usuario;
    }

});
