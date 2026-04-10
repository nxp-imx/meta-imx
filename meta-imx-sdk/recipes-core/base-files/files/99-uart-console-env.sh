
case "$(tty)" in
    /dev/ttyS*|/dev/ttyLP*|/dev/ttymxc*|/dev/console)
    unset PROMPT_COMMAND
    unset -f __systemd_osc_context_precmdline
    ;;
esac
