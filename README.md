# financas
Projeto criado para gerenciar os gastos domésticos e criar um orçamento familiar  

# Engenharia de software moderna
https://engsoftmoderna.info/artigos/arquitetura-hexagonal.html#:~:text=Uma%20Arquitetura%20Hexagonal%20divide%20as,tais%20como%20bancos%20de%20dados).

criar uma instancia EC2 na AWS

copiar a credencial.pem escolhida e dar a seguinte permissao
    
    chmod 400 "dev-instance-key.pem"

conecte-se a instancia conforme comando associado

    ssh -i "dev-instance-key.pem" ec2-user@ec2-54-233-167-183.sa-east-1.compute.amazonaws.com

instale o docker

    sudo yum install docker

instale o docker compose

    sudo curl -L "https://github.com/docker/compose/releases/download/v2.24.5/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

dar permissao de execussao ao docker-compose 

    sudo chmod +x /usr/local/bin/docker-compose


copie o arquivo docker compose para o destino

    scp -i ~/labs/cloud/AWS/credentials/dev-instance-key.pem  ./docker-compose.yml ec2-user@ec2-54-233-167-183.sa-east-1.compute.amazonaws.com:/home/ec2-user/

inicie o docker service

    sudo service docker start

suba o docker compose

    sudo docker-compose up

crie um security group para acessar o mysql de um client local esse sg deve expor a porta onde o mysql esta rodando

crie um script de start para inicializar o docker e o docker compose ao iniciar a instancia e mova esse script para /etc/systemd/system

    #!/bin/bash
    sudo service docker start
    sudo docker-compose up


crie um servico  e mova para /etc/systemd/system

    [Unit]
    Description=Script para iniciar docker compose.

    [Service]
    Type=simple
    ExecStart=/bin/bash /etc/systemd/system/start.sh

    [Install]
    WantedBy=multi-user.target

habilite o servico criado

    systemctl enable nome_do_servico.service



    