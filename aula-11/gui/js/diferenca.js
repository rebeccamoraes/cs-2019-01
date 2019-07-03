// Path para a requisição (URL)
        const PATH = "http://localhost:9876/ds?inicio=";

        function atualizaDiferenca() {
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    let diferenca = extraiDiferencaDaResposta(xhttp.responseText);
                    document.getElementById("resultado").innerHTML = diferenca;
                }
            };

            let dtInicial = document.getElementById("dataInicial").value;
            let dtFinal = document.getElementById("dataFinal").value;
            let dataInicial = formataData(dtInicial);
            let dataFinal = formataData(dtFinal);
            xhttp.open("GET", montaURL(dataInicial, dataFinal), true);
            xhttp.send();
        }

        function montaURL(dataInicial, dataFinal) {
            return PATH + dataInicial + "&final=" + dataFinal;
        }

        function dataCorrente() {
            document.getElementById("data").valueAsDate = new Date();
        }

        // Funções para integração (satisfazer contrato do servidor)

        function extraiDiferencaDaResposta(resposta) {
            return JSON.parse(resposta).diferenca;
        }

        // Dia ou mês deve possuir dois dígitos
        function formataDiaOuMes(n) {
            return ("00" + n).substr(-2, 2);
        }

        // Ano deve possuir quatro dígitos
        function formataAno(n) {
            return ("0000" + n).substr(-4,4);
        }

        // ENTRADA: ano-mes-dia SAIDA: dd-mm-yyyy
        function formataData(data) {
            let [a, m, d] = data.split("-");

            let dia = formataDiaOuMes(d);
            let mes = formataDiaOuMes(m);
            let ano = formataAno(a);

            return `${d}-${m}-${a}`;
        }