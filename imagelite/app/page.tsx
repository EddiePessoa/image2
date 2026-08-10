import Image from "next/image";
import { PrimeiroComponente } from "./componentes/PrimeiroComponente";

export default function Home() {
  return (
    <div>
      <main>
        <h1>Ola Mundo</h1>
        <PrimeiroComponente/>
      </main>
    </div>
  );
}
