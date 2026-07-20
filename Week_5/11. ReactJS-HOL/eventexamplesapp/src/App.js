import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello Member!");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const welcome = (msg) => {
    alert(msg);
  };

  const onPress = (event) => {
    alert("I was clicked");
    console.log(event);
  };

  return (
    <div className="App" style={{ margin: "20px" }}>
      <h1>Event Examples App</h1>
      <h2>Counter : {count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br />
      <br />
      <button onClick={() => welcome("Welcome")}>
        Say Welcome
      </button>
      <br />
      <br />
      <button onClick={onPress}>
        Click on me
      </button>
      <br/>
      <CurrencyConvertor />
    </div>
  );
}

export default App;