import { CalculateScore } from "./components/CalculatorScore.js";
function App() {
  return (
    <div>
      <CalculateScore
        Name="Steve"
        School="DVN  Public School"
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
