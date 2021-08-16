# All i.MX after 6 have hardware support for entropy, so there is no
# need for rng-tools, esp. since it pegs the CPU at startup.
RRECOMMENDS:${PN}-sshd:remove:imx = "rng-tools"
