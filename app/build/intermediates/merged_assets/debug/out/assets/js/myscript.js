var auid = document.getElementById("myAudio");
function setPlaySpeed025() { 
    auid.playbackRate = 0.25;
}
function setPlaySpeed050() { 
    auid.playbackRate = 0.5;
}
function setPlaySpeed075() { 
    auid.playbackRate = 0.75;
}
function setPlaySpeed1() { 
    auid.playbackRate = 1;
}
function setPlaySpeed125() { 
    auid.playbackRate = 1.25;
}
function setPlaySpeed150() { 
    auid.playbackRate = 1.5;
}
function setPlaySpeed175() { 
    auid.playbackRate = 1.75;
}

function aud_play_pause() {
	var myAudio = document.getElementById("myAudio");
	var playimg = "http://tedswoodworkingdiy.com/nivasset/play.png";
	var pauseimg = "http://tedswoodworkingdiy.com/nivasset/pause.png";
	var swapimg = document.getElementById("playclick");
  swapimg.src = swapimg.src == pauseimg ? playimg : pauseimg;
	if (myAudio.paused) {myAudio.play();
	
	} 
	else {myAudio.pause();}}

function toggleDayNight() {
  var body = document.getElementById("body");
  var currentClass = body.className;
  body.className = currentClass == "nightmode" ? "daymode" : "nightmode";
  var nightImg= "http://tedswoodworkingdiy.com/nivasset/nightmode.png";
  var dayImg= "http://tedswoodworkingdiy.com/nivasset/daymode.png";
  var swapimg = document.getElementById("pic");
  swapimg.src = swapimg.src == dayImg ? nightImg : dayImg;
}
//scroll
var playbutton = document.querySelector('.optionbar');
var playbuttonPosition = playbutton.getBoundingClientRect().bottom;
window.addEventListener('scroll', function() {
    if (window.pageYOffset >= playbuttonPosition) {
      playbutton.style.position = 'fixed';
      playbutton.style.top = '5px';
	  playbutton.style.right = '5px';	
	  
    } else {
      playbutton.style.position = 'static';
      playbutton.style.top = '';		
    }
});

var aid = document.getElementById("myAudio");
var slider = document.getElementById("myRange");
var output = document.getElementById("demo");
if (slider.value = 1){output.innerHTML = "1.0";}
//output.innerHTML = slider.value; printout default value
slider.oninput = function() {
if (this.value != 1.0){
  output.innerHTML = this.value; //printout selected value
aid.playbackRate = this.value;
}else{
output.innerHTML = "1.0"; //printout selected value
aid.playbackRate = this.value;
}
}