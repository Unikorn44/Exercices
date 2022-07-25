class Previsions extends HTMLElement {
    constructor(date) {
        super();
        const template = document.querySelector('#template-previsions');
        const cloned = document.importNode(template?.content, true);
        const style = document.createElement("style");
        style.innerHTML = `
            .content-previsions {
                background: linear-gradient(#64bde6, #c0e5e2);
                ;
                border-radius: 1em;
                box-shadow: 10px 5px 5px rgb(65, 58, 58);
                padding: 1em 0;
                text-align: center;
                width: 10em;
            }
        `;
        const shadow = this.attachShadow({ mode: 'open' });
        shadow.appendChild(style);
        shadow.appendChild(cloned);
    }
}
customElements.define('prevision-element', Previsions);
