

let hourTime = window.document.querySelector('div#hours');
let messege = window.document.querySelector('h1#messege');
let img = window.document.querySelector('img#img')
let now  = new Date();

function carregar(){
    if(now.getHours() > 6 && now.getHours() <= 12){
        messege.innerHTML = 'Good Morning!';
        hourTime.innerHTML = 'Agora é '+now.getHours() + 'horas...';
        img.src = 'imgmanha.jpg';
    }else if(now.getHours() > 12 && now.getHours() <= 19){
        messege.innerHTML = 'Good Afternoon!';
        hourTime.innerHTML = 'Agora é '+now.getHours() + ' horas...'
        img.src = 'imgtarde.jpg';
    }else if(now.getHours() > 19 || now.getHours() <=6){
        messege.innerHTML = 'Good Night!';
        hourTime.innerHTML = 'Agora é '+now.getHours() + ' horas...'
        img.src = 'imgnoite.jpg';
    }
}
