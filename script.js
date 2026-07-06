document.getElementById('bookingForm')?.addEventListener('submit', async function(e) {
    e.preventDefault();
  
    const booking = {
      fullName: e.target[0].value,
      email: e.target[1].value,
      serviceType: e.target[2].value,
      date: e.target[3].value,
      message: e.target[4].value
    };
  
    try {
      const res = await fetch('http://localhost:8080/api/bookings', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(booking)
      });
  
      if (res.ok) {
        alert(' Booking submitted successfully!');
        e.target.reset();
      } else {
        alert(' Failed to submit booking.');
      }
    } catch (error) {
      console.error(error);
      alert(' Server connection failed.');
    }
  });

  function display(){
      let nameEle = document.getElementById('txt');
      console.log(nameEle.value);

      let json = {};
      json.email = nameEle.value;
      console.log(json);
  }
  