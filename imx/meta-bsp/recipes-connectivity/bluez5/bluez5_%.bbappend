# Do not start the service during system boot up
INITSCRIPT_PARAMS_${PN} = "stop 20 0 1 6 ."
