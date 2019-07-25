let book1 = {title:"Lightning Thief", author:"Rick Riordan", genre:"Fantasy Fiction"};
let book2 = {title:"Harry Potter", author:"J.K. Rowling", genre:"Fantasy Fiction"};
let book3 = {title:"Twilight", author:"Stephenie Meyer", genre:"Fantasy Fiction"};

 let myBookShelf = new Array();

 myBookShelf[0] = book1;
 myBookShelf[1] = book2;
 myBookShelf[2] = book3;
let text = "";
text += book1.title;

for(let i = 0; i<array.length;i++){
    text += array[i].title+"  ";
    text += array[i].author;
}



 document.write(text);
 
