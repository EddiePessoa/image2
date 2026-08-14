'use client';

import { createElement } from "react";

export function PrimeiroComponente(){
/*
  function clique() { 
    console.log('Você clicou no botão!');
    alert('Você clicou no botão!');

    createElement('h1', null, 'Você clicou no botão!');
  } */

  const clique = () => {
    console.log('Você clicou no botão!');
    alert('Você clicou no botão!');

    return <p>CAsa de bala</p>
  }

  return(
    <div> 
      <h1>Primeiro Componente</h1>
      <button onClick={clique}>Clique aqui!</button>

    </div>
  );
} 