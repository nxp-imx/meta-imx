PROVIDES_remove_mx6sx = "virtual/libgl"

EXTRA_OECONF_mx6 := "${@'${EXTRA_OECONF}'.replace('--enable-glx-tls','--enable-glx')}"
