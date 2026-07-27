
import './App.css';
import officeimg from './officeimg.jpg'

function App() {
  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai",
  };
  const officeList = [
    {
      Name: "Oracle",
      Rent: 70000,
      Address: "Hyderabad",
    },
    {
      Name: "Amazon",
      Rent: 90000,
      Address: "Bangalore",
    },
    {
      Name: "Qualcomm",
      Rent: 55000,
      Address: "Pune",
    },
  ];
  const element = "Office Space"
  const att = <img
      src={officeimg}
      width="300"
      height="200"
      alt="Office Space"
    />
  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {att}
      <h3>Name: {office.Name}</h3>
      <h4 className={office.Rent < 60000 ? "textRed" : "textGreen"}>
        Rent: Rs. {office.Rent}
      </h4>
      <h5>Address: {office.Address}</h5>
      <hr/>
      <h2>Office List</h2>
      {officeList.map((item, index) => (
        <div key={index}>
          <h3>Name: {item.Name}</h3>
          <h4 className={item.Rent < 60000 ? "textRed" : "textGreen"}>
            Rent: Rs. {item.Rent}
          </h4>
          <h5>Address: {item.Address}</h5>
          <hr/>
        </div>
      ))}
    </div>
  );
}

export default App;
