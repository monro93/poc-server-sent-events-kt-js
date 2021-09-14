const eventSourceURL = 'http://localhost:3099/emitter'
const registerEventURL = 'http://localhost:3099/register-event'

let eventSource

document.querySelector('#connect-btn')
  .addEventListener('click', function (event) {
    if(!event.target.getAttribute('connected')) {
      eventSource = new EventSource(eventSourceURL + '?userId=123')
      connectEventSource(eventSource)
      event.target.innerText = "Disconnect"
      event.target.setAttribute('connected', 1)
      console.log("connected")
    }else {
      disconnectEventSource(eventSource)
      event.target.innerText = "Connect"
      event.target.removeAttribute('connected')
      console.log("disconnected")
    }
})

function connectEventSource(eventSource) {
  eventSource.addEventListener("message", (event) => {
    console.log(event.data)
    const message = event.data
    const text = document.createElement('p')
    text.innerText = message
    const output = document.querySelector('#message-output')
    output.appendChild(text)
    output.scrollTop = output.scrollHeight
  })
}

function disconnectEventSource(eventSource) {
  eventSource.close()
  eventSource = null
}

document.querySelector('#register-event-btn')
.addEventListener('click', function (event) {
  const xmlHttp = new XMLHttpRequest()
  xmlHttp.onreadystatechange = function() {}
  xmlHttp.open("GET", registerEventURL, true)
  xmlHttp.send(null)
})
