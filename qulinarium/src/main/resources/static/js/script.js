var divIdN = 0;

function addProductToCart(dishName, price) {
    var divIdS="prod";
    var divId = divIdS + divIdN;
    var getTotal =$('.cart-total').html();
    var priceOfProduct = parseFloat(price);
    var total = parseFloat(getTotal);
    var divContent = "<div class=\"addedProduct d-flex align-items-center justify-content-between\" id =\"" + divId+ "\">" + dishName +"  " + price +
        " <span class=\"badge bg-primary rounded-pill deleteProduct\"  onclick=\"deleteProduct(" + price + "," + divId + ")\">Usuń</span>" +"</div>";

    divIdN++;

    total += priceOfProduct;

    $('.cart-total').html(total.toFixed(2));

    $('#productList').append(divContent);
    $('.cart-total').fadeOut(300);
    $('.cart-total').fadeIn(300);
    document.getElementById('asd').value = total;
    document.getElementById('dishes').value += dishName +", ";
    document.getElementById('restNamePass').value = document.getElementById('restName').textContent;


}

function deleteProduct(price,divId){

    $(divId).remove();

    var getTotal =$('.cart-total').html();
    var total = parseFloat(getTotal);
    total -= price;
    $('.cart-total').html(total.toFixed(2));
    $('.sum').fadeOut(300);
    $('.sum').fadeIn(300);
    document.getElementById('asd').value = total;


}

function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
    }, 1000);
}

window.onload = function () {
    var fiveMinutes = 60 * 45,
        display = document.querySelector('#time');
    startTimer(fiveMinutes, display);
};