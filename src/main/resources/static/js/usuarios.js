window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    const usuarios = document.getElementById('usuarios');
    if (usuarios) {
        cargarUsuarios();
        new simpleDatatables.DataTable(usuarios);
    }
    async function cargarUsuarios(){
    fetch('usuario')
      .then(response => response.json())
      .then(usuarios => console.log(usuarios));
    }
});
