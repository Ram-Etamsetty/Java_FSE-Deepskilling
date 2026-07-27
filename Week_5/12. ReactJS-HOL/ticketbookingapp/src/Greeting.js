import UserGreeting from "./UserGreeting";
import GuestGreeting from "./GuestGreeting";

function Greeting(props) {
  if (props.isLoggedIn) {
    return(
        <div>
    <h1>Flight Details</h1>

      <table cellPadding="5">
        <thead>
          <tr>
            <th>Flight</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Fare</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹5000</td>
          </tr>

          <tr>
            <td>6E202</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>₹4500</td>
          </tr>
        </tbody>
      </table>
     <UserGreeting />
     </div>
    )
  }

  return <GuestGreeting />;
}

export default Greeting;