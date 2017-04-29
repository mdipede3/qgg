<!DOCTYPE HTML>

<html lang="pl">
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <link href="CSS/style.min.css" rel="stylesheet" />
        <title>HazeBankCredit</title>
    </head>
    <body>
      <header>
        <p class="logo"><img src="Image/coin.png" class="logo_coin_size" alt="logo coin"></img>HazeBank Credit</p>
      </header>
    <main class="app">
        <p class="app_text" id="app_text"> Ustaw wartosci dla kredytu </p>
        <section>
            <form id="form" action="summary" method="post">
                <table>
                  <tbody>
                    <tr>
                <td><label>Kwota kredytu:</td><td><input class="test-element" type="text" name="summaryCredit" required/></td></label>
                    </tr>
                    <tr>
                <td><label>Ilosc rat :</td><td><input class="test-element" type="text" name="stock" required/></label></td>
                  </tr>
                  <tr>
                <td><label>Oprocentoanie:</td><td><input class="test-element" type="text" name="percentCredit" required/></td></label>
                </tr>
                <tr>
                <td><label>Opłata stała:</td><td><input class="test-element" type="text" name="constantFee" required/></td></label>
              </tr>
            </tbody>
          </table>
                <label>
                <select class="app_select" name="select">
                <option value="constant"> Rata Stała</option>
                <option value="less"> Rata malejąca </option>
                </select>
                </label>
                  <section class="app_buttons">
                  <div>
                  <p class="app_buttons_line"><button  class="app_button" type="submit" name="getPdf" value="Get Pdf" /><img class="app_button_image_pdf" src="Image/button_pdf.jpg"></img></button></p><p class="app_buttons_line" >Pobierz PDF</p>
                </div>
                  <div class="app_buttons_row">
                  <p class="app_buttons_line"><button class="app_button" type="submit" name="getPdf" value="Send" /><img class="app_button_image_html" src="Image/button_html.png"></img></button></p><p class="app_buttons_line app_buttons_line_padding">Wyswietl Tabele</p>
                </div>
              </section>
            </form>
        </section>
    </main>
    <footer>

    </footer>
    <script src="Client/client.min.js"></script>
    </body>
</html>
