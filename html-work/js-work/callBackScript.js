const news = [
    {title: 'First News', description: 'Our first news'},
    {title: 'Second News', description: 'Our Second News'},
    {title: 'Other News', description: 'Some other news'}
];

function getAllNews(){
    setTimeout(()=>{
    let output = '';
    news.forEach((theNews, index)=>{
        output += `<li>${theNews.title}</li>`;
    });
    document.body.innerHTML = output;
    }, 1000);
}

function createNewNews(theNews, callBack){
    setTimeout(()=>{
        news.push(theNews);
        callBack();
    }, 2000);
}

// getAllNews();
createNewNews(
    {title: 'Breaking News', description: 'Added later on'},
    getAllNews);