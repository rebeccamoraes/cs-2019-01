// Path para a requisição (URL)
        const PATH = "http://localhost:1234/ds?";

        function atualizaResultado() {
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    let resultado = extraiResultadoDaResposta(xhttp.responseText);
                    document.getElementById("resultado").innerHTML = resultado;
                }
            };

            let numero = document.getElementById("numero").value;
            xhttp.open("GET", montaURL(numero), true);
            xhttp.send();
        }

        function montaURL(numero) {
            return PATH + "numero=" + numero;
        }

        // Funções para integração (satisfazer contrato do servidor)

        function extraiResultadoDaResposta(resposta) {
            return JSON.parse(resposta).numero;
        }

