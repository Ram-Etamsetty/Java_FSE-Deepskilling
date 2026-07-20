function GuestGreeting() {
  return (
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

      <p><b>Please Login to Book Tickets.</b></p>
    </div>
  );
}

export default GuestGreeting;