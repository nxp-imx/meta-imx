PACKAGECONFIG:append = " examples"

PACKAGECONFIG[printing-and-pdf] = "-DFEATURE_webengine_printing_and_pdf=ON,-DFEATURE_webengine_printing_and_pdf=OFF,cups"
