import { useState } from 'react';
import './App.css';

function App() {
  const [displayText, setDisplayText] = useState('');

  const handleClick = () => {
    fetch("https://run.mocky.io/v3/c4f8a32f-bd11-4d4f-b35b-0f25b2ed52cf")
      .then((response) => response.json())
      .then((data) => {
        setDisplayText(JSON.stringify(data));
      });
  };

  return (
    <div className="App">
      <body>
        <button className="GetResponseButton" onClick={handleClick}>Get Response</button>
      </body>
      {displayText && <p>{displayText}</p>}
    </div>
  );
}

export default App;
